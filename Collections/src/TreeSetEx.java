
import java.util.TreeSet;

  /*
  
    -contains unique elements only like HashSet. 
    The TreeSet class implements NavigableSet interface that extends the SortedSet interface.
    -maintains ascending order.

 */

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add("Saswati");
		ts.add("Java");
		ts.add("Sibi");
		ts.add("Java");
		
		System.out.println(ts);
		System.out.println(ts.first());
	}
	

}
