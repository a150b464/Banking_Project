
import java.util.*;

class Student
{
	String name;
	int marks;
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public String toString()	
	{
		return(name+"   "+marks);
	}
	public boolean equals(Object ob)
	{
		Student st=(Student)ob;
		return(marks==st.marks && name.equals(st.name));
	}
}
public class ArrayListTest2
{
	public static void main(String s[])
	{
		ArrayList al=new ArrayList();
		Student st=new Student("abc",90);
		al.add(st);
		al.add(new Student("xyz",85));
		al.add(new Student("mno",75));
		al.add(new Student("hij",65));
		al.add(new Student("def",55));
	
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		
		ArrayList al2=new ArrayList();
		al2.add("ram");
		al2.add("shayam");
		al2.add("ravi");
		al2.add("kishan");
		al2.add("sanjay");
		
		System.out.println("Contains:   "+al.contains(new Student("abc",90)));
		//System.out.println("Contains:   "+al.contains(st));
		System.out.println("Removed mno 75:   "+al.remove(new Student("mno",75)));
		
		
		
		/*ListIterator itr2=al2.listIterator();  
		  
		System.out.println("traversing elements in forward direction...");  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		 }  
		  
		  
		System.out.println("traversing elements in backward direction...");  
		while(itr2.hasPrevious()){  
		System.out.println(itr2.previous());  
		 }  */
	}
}





		
			
			