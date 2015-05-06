package Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingletonDesignPattern {

	public static void main(String ar[]) {
		try {
			SingletonDesignPattern sd = SingletonDesignPattern.getInstance();

			System.out.println("Hashcode for 1st object: " + sd.hashCode());

			SingletonDesignPattern sd1 = null;

			// sd1 = (SingletonDesignPattern) sd.clone();

			for (Constructor<?> co : SingletonDesignPattern.class
					.getDeclaredConstructors()) {
				co.setAccessible(true);
				sd1 = (SingletonDesignPattern) co.newInstance();
				break;
			}

		} catch (SingletonInstanceCustomException | InstantiationException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}

class SingletonInstanceCustomException extends Exception {

	private static final long serialVersionUID = -8098149259309546094L;

	@Override
	public String toString() {
		return "Instance creation not allowed using constructor.";
	}
}

class SingletonDesignPattern {
	private static SingletonDesignPattern obj;

	private SingletonDesignPattern() throws SingletonInstanceCustomException {
		if (obj != null)
			throw new SingletonInstanceCustomException();
	}

	public static SingletonDesignPattern getInstance()
			throws SingletonInstanceCustomException {
		if (obj == null) {
			synchronized (SingletonDesignPattern.class) {
				if (obj == null) {
					obj = new SingletonDesignPattern();
				}
			}
		}
		return obj;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	private Object readResolve() throws SingletonInstanceCustomException {
		if (obj != null) {
			return new SingletonDesignPattern();
		}
		return null;
	}
}

class DeserializedSingleton{
	public static void main(String ar[]) throws FileNotFoundException, IOException, ClassNotFoundException, SingletonInstanceCustomException{
		SingletonDesignPattern obj = SingletonDesignPattern.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("xyz.ser"));
		out.writeObject(obj);
		out.close();
		
		ObjectInput in  = new ObjectInputStream(new FileInputStream("xyz.ser"));
		SingletonDesignPattern obj1 = (SingletonDesignPattern)in.readObject();
		in.close();
		System.out.println("obj : "+ obj.hashCode());
		System.out.println("obj1 : "+obj1.hashCode());
	}
}
