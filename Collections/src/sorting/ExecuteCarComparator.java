package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExecuteCarComparator {

	public static void main(String[] args) {
		Car c1 = new Car(1,2500);
		Car c2 = new Car(1,4000);
		
		ArrayList<Car> al=new ArrayList<Car>();
		al.add(c1);
		al.add(c2);
		
		
		//System.out.println(al);
		
		Collections.sort(al, new PriceComparator());
		System.out.println("Collection is sorted on the basis of price");
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			Student obj = (Student) itr.next();
			System.out.println("Name: "+obj.getName()+" Age: "+obj.getAge()+" Roll No: "+obj.getRollNo());
		}
		
		
		Collections.sort(al, new AgeComparater());
		System.out.println("Collection is sorted on the basis of Age");
		Iterator itr1=al.iterator();
		while (itr1.hasNext()) {
			Student obj = (Student) itr1.next();
			System.out.println("Name: "+obj.getName()+" Age: "+obj.getAge()+" Roll No: "+obj.getRollNo());
		}
		
		
	}
	
}
