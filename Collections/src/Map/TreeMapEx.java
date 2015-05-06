package Map;

import java.util.*; 
/*
 * 
    A TreeMap contains values based on the key. 
    It implements the NavigableMap interface and extends AbstractMap class.
    It contains only unique elements.
    It cannot have null key but can have multiple null values.
    It is same as HashMap instead maintains ascending order.
No duplicate keys are stored
Iterator interface is only for collections. So maps should be converted to sets
 */

public class TreeMapEx{  
 public static void main(String args[]){  
   
  TreeMap<Integer, String> hm=new TreeMap<Integer, String>();  
  
  hm.put(100,"null");  
  hm.put(100,"null");  
  hm.put(105,null);  
  hm.put(103,"Rahul");  
  hm.put(106,"Tom"); 
  /*hm.put(null, "jdhfkl");*/ // HashMap can cot contain null as a key , gives you nullpointer Exception at runtime
  
  Set set=hm.entrySet();  
  Iterator itr=set.iterator();  
  
  while(itr.hasNext()){  
   Map.Entry m=(Map.Entry)itr.next();  
   System.out.println(m.getKey()+" value "+m.getValue());  
  }  
 }  
}  
