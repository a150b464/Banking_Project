package Map;

import java.util.*;

public class HashSetEx {

	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		
		System.out.println("Adding first item in hashset :" + set.add("Java"));
		System.out.println("Adding Seeond time Hahset :" + set.add("Python"));
		System.out.println("Number Of Elements in Set are :" + set.size());
		System.out.println(set);
	}
}
