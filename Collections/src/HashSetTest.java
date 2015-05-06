import java.util.*;

/*
 * 
 -uses hashtable to store the elements.
 It extends AbstractSet class and implements Set interface.
 -neither allows duplicate elements nor order or position its elements.
 - contains unique elements only.
 - Hash set allows null values.
 */
class HashSetTest {
	public static void main(String s[]) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("apple");
		hs.add("banana");
		hs.add("citrus");
		hs.add("apple");
		hs.add("vao");
		hs.add(null); // hashset allows null value .
		System.out.println("size of list is ; " + hs.size());
		System.out.println("elements are stored into has set");
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
	}
}
