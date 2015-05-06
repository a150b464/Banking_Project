/*
 -uses a dynamic array for storing the elements.
 -It extends AbstractList class and implements List interface.
 -can contain duplicate elements.
 -maintains insertion order.
 -not synchronized.(not thread safe)
 -random access because array works at the index basis. arr[2]
 -manipulation slow because a lot of shifting needs to be occurred.
 ArrayList()
 ArrayList(Collection c)
 ArrayList(int capacity)

 */

import java.util.*;

class ArrayListTest {
	public static void main(String s[]) {
		// ArrayList<Integer> fruits=new ArrayList<Integer>();

		ArrayList<String> fruits = new ArrayList<String>(); // defining an object of ArrayList

		System.out.println("ArrayList object created");

		fruits.add("Apple");
		fruits.add("Peach");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add(3, "Grapes");
System.out.println(fruits.indexOf("Peach"));
		ArrayList<String> vegetables = new ArrayList<String>();

		vegetables.add("Tomato");
		vegetables.add("Brinjal");

		fruits.addAll(0, vegetables);

		System.out.println("Using Iterator List of elements:");

		Iterator<String> itr = fruits.iterator(); // creating an object of iterator
											// interface method boolean
											// hasNext(), Object next(), void
											// remove()

		while (itr.hasNext()) {
			String str =  itr.next();
			
			System.out.println("Using Iterator " +str);
		}

		// Collections.synchronizedList(fruits); // to make an arrayList
		// synchronize.

		System.out.println("\nElements of ArrayList:   " + fruits.toString());
//Retainall retains the common elements 
		fruits.retainAll(vegetables);

		ListIterator<String> ltr = fruits.listIterator();

		while (ltr.hasNext()) {
			System.out.println("Iteration in forward " +ltr.next());
		}
		ltr.add("Cherry");

		while (ltr.hasPrevious()) {
			System.out.println("Iteration in previous " +ltr.previous());
		}

		System.out.println("indexof Apple:   " + fruits.indexOf("Apple"));

		System.out.println("last indexof Apple:   "
				+ fruits.lastIndexOf("Apple"));
		

		System.out.println("remove Apple:   " + fruits.remove("Apple"));
		System.out.println("contains Apple:   " + fruits.contains("Apple"));

		System.out.println("indexof Apple:  " + fruits.indexOf("Apple"));

	}
}
