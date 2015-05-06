package com.john.purcell;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImpl implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(("Nain Thread Id " +Thread.currentThread().getId()));
		System.out.println(("Main Thread Name " +Thread.currentThread().getName()));
		new Thread(new MapImpl()).start();

	}

	static void testMap(Map<Integer, String> map) {
		map.put(0, "Horse");
		map.put(4, "Lion");
		map.put(3, "Tiger");
		map.put(7, "Hippo");
		map.put(2, "Zebra");
		map.put(9, "Eagle");
		map.put(1, "Giraffe");

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println("Key " + key + " Value " + value);
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		System.out.println(("Current Thread Id " +Thread.currentThread().getId()));
		System.out.println(("Current Thread  " +Thread.currentThread().getName()));		System.out.println("HashMap");
		testMap(hashmap);
		System.out.println("\nLinkedHashMap");
		testMap(linkedhashmap);
		System.out.println("\nTreeMap");
		testMap(treemap);
	}

}
