package sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExecuterComparable {

	
	public static void main(String[] args) {
		
		
		List<Integer> al=new ArrayList<Integer>();
		
		al.add(1000);
		al.add(230);
		al.add(213);
		al.add(110);
		
//Collections.sort(al);
		Iterator<Integer> itr1=al.iterator();
		while (itr1.hasNext()) {
			Integer obj = (Integer) itr1.next();
			System.out.println("UnSorted Collection");
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Sorted Collection");
		Collections.sort(al);
		
		Iterator<Integer> itr=al.iterator();
		while (itr.hasNext()) {
			Integer obj = (Integer) itr.next();
			System.out.println(obj);
		}
	}
	
}
