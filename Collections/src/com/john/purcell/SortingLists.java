package com.john.purcell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		/*
		 * if (o1.length() > o2.length()) { return 1; } else if (o1.length() <
		 * o2.length()) { return -1; }
		 */
		Integer l1 = o1.length();
		Integer l2 = o2.length();
		return l1.compareTo(l2);
	}
}

public class SortingLists {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();

		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Elephant");
		animals.add("Fish");
		animals.add("Mantis");
		animals.add("Alligator");
		animals.add("Leopard");
		animals.add("Cheetah");
		animals.add(2, "Cow");
		
		for (String animal : animals) {
			System.out.println(animal);
		}

		Collections.sort(animals, new StringLengthComparator());
		System.out.println("_________*********________________");
		System.out.println("Sorted Elements ");
		for (String animal : animals) {
			System.out.println(animal);
		}
//Creating List of Custom Objects
		List<Employee> person = new ArrayList<Employee>();
		person.add(new Employee("Adam", 2));
		person.add(new Employee("Zach", 3));
		person.add(new Employee("Carrie", 6));
		person.add(new Employee("Ben", 9));

		// Sorts Employee Collection on basis of name by using anonymous Class
		Collections.sort(person, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}

		});
		for (Employee emp : person) {
			System.out.println(emp);
		}
	}
}