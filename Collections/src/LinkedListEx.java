
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * 
   - uses doubly linked list to store the elements. 
   - It extends the AbstractList class and implements List and Deque interfaces.
   - can contain duplicate elements.
   - maintains insertion order.
   - not synchronized.
   - No random access.
   - manipulation fast because no shifting needs to be occurred.
   - can be used as list, stack or queue.
LinkedList()
LinkedList(Collection c)
 */
public class LinkedListEx {
	public static void main(String args[]){  
		   
		  LinkedList al=new LinkedList();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  ListIterator itr= al.listIterator();  
		  while(itr.hasPrevious()){  
		   System.out.println(itr.previous());  
		  }  
		 }  
}
