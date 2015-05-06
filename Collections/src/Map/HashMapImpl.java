package Map;

import java.util.HashMap;

public class HashMapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Aditya", 1);
		hm.put("Aditya", 2);
		hm.put("Aditya", 5);
		System.out.println(hm.get("Aditya"));
		System.out.println(hm.containsValue(1));

	}
}