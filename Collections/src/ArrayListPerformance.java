import java.util.ArrayList;
import java.util.List;

public class ArrayListPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list1 = new ArrayList<Object>();

		for (int i = 0; i < 1e7; i++) {
			list1.add(i);
		}
		System.out.println(list1.size());
		long start = System.nanoTime();
		list1.add(0, 5);
		long end = System.nanoTime();
		System.out.println("Time taken to add at beginning: " + (end - start));
		long start1 = System.nanoTime();
		list1.add(243);
		long end1 = System.nanoTime();
		System.out.println("Time taken to add at end: " + (end1 - start1));
		System.out.println(list1.size());

		// Adding 243 at beginning of list
		long start2 = System.nanoTime();
		list1.add(list1.get(0));
		list1.set(0, 243);
		long end2 = System.nanoTime();
		System.out.println("Time taken to add at beginning by Reordering and swapping: "
				+ (end2 - start2));
		System.out.println(list1.get(0));
		System.out.println(list1.get(list1.size()-1));
	}

	@Override
	public String toString() {
		return "ArrayListPerformance [getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
