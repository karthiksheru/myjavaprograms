import java.util.LinkedList; 
import java.util.Iterator; 
public class LinkedListExample{  
 public static void main(String args[]){  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  Iterator<String> itr=al.descendingIterator();  
  while(itr.hasNext()){  
  System.out.println(itr.next());  
  }  
 }  
}  