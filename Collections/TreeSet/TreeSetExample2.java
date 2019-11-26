import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;
class TreeSetExample2
{
  public static void method()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter How many values");
    int size = sc.nextInt();
    System.out.println("Please Enter "+size+" Elements");
    TreeSet<String> ts=new TreeSet<>();
    for(int i = 0;i<size;i++)
    {
      String x = sc.next();
      ts.add(x);
    }
    System.out.println("The Elements of TreeSet are ---");
    Iterator<String> it1=ts.iterator();
    while(it1.hasNext())
    System.out.println(it1.next());
    System.out.println("The Elements of TreeSet are ---");
    NavigableSet<String> it2=ts.descendingSet();
    for(Object a:it2)
    System.out.println(a);
    System.out.println("The Highest Element in the TreeSet is = "+ts.last());   
    System.out.println("The Lowest Element in the TreeSet is = "+ts.first());
    System.out.println("Please Enter from the Range you want to delete the elements");
    System.out.println("ENTER FROM RANGE");
    String value1 = sc.next();
    System.out.println("ENTER TO RANGE");
    String value2 = sc.next();
    NavigableSet ns = ts.subSet(value1,false,value2,true);
    System.out.println(ns);
    NavigableSet ns1 = ts.headSet(value1,true);
    System.out.println("The elements upto "+value1+" are = "+ns1);  
    NavigableSet ns2 = ts.tailSet(value2,true);
    System.out.println("he elements upto "+value2+" are = "+ns2);  
}
  public static void main(String[] args)
  {
   method();    
  }
}