package com.john.purcell;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new LinkedList<String>();

		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Elephant");
		animals.add("Fish");
		animals.add("Mantis");
		animals.add("Alligator");
		animals.add("Leopard");
		animals.add("Cheetah");

		Iterator<String> it = animals.iterator();

	/*	while (it.hasNext()) {
			String value = it.next();
			it.remove();
		}*/
		while (it.hasNext()) {
			String value = it.next();
			animals.remove(value);
			
			if (value.equalsIgnoreCase("Fish")) {
				it.remove();

				System.out.println("Item removed " + value);
			} else {
				System.out.println(value);
			}
		}
		System.out.println("Final List" + animals);
	}
}
