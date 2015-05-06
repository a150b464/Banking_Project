package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExecuterComparator {

	public static void main(String[] args) {
		Student s1=new Student("Saswati", 23, 111);
		Student s2=new Student("Sibi", 24, 122);
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(new Student("Amit", 24, 155));
		al.add(new  Student("Bob", 31, 166));
		
		
		//System.out.println(al);
		
		Collections.sort(al, new NameComparator());
		System.out.println("Collection is sorted on the basis of name");
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
