package Map;

import java.util.*; 
/*No Same keys in Hashmap
 * But same values can be stored but key must be unique.
 * 
 */
public class HashMapEx{  
 public static void main(String args[]){  
   
  HashMap<Integer, String> hm=new HashMap<Integer, String>();  
  
  hm.put(100,"Aditya");  
  hm.put(106,null);  
  hm.put(101,"Vijay");  
  hm.put(103,"vikram");
  hm.put(100,"Mark"); 	
  hm.put(null,null); 
  hm.put(null,null); 

  Set<?> set=hm.entrySet();  
  Iterator<?> itr=set.iterator();  
  
  while(itr.hasNext()){  
   Map.Entry m=(Map.Entry)itr.next();  
   System.out.println("Key "+m.getKey()+" value "+m.getValue());  
  }  
 }  
}  
