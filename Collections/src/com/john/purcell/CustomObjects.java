package com.john.purcell;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

public class CustomObjects {

	public static void main(String[] args) {

		Person p0 = new Person(0, "Adam");
		Person p1 = new Person(1, "Ken");
		Person p2 = new Person(2, "Eve");
		Person p3 = new Person(0, "Adam");
		System.out.println("P0 hashcode " + p0.hashCode());
		System.out.println("P1 hashcode " + p3.hashCode());
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p0, 1);

		for (Person Key : map.keySet()) {
			System.out.println(Key + ": " + map.get(Key));
		}

		Set<Person> set = new LinkedHashSet<Person>();
		set.add(p0);
		set.add(p1);
		set.add(p2);
		set.add(p3);

		System.out.println("Set Values are" + set);

	}

}