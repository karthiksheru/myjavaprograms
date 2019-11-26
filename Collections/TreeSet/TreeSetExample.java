import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;
class TreeSetExample
{
  public static void method()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter How many values");
    int size = sc.nextInt();
    System.out.println("Please Enter "+size+" Elements");
    TreeSet<Integer> ts=new TreeSet<>();
    for(int i = 0;i<size;i++)
    {
      int x = sc.nextInt();
      ts.add(x);
    }
    System.out.println("The Elements of TreeSet are ---");
    Iterator<Integer> it1=ts.iterator();
    while(it1.hasNext())
    System.out.println(it1.next());
    System.out.println("The Highest Element in the TreeSet is = "+ts.last());   
    System.out.println("The Lowest Element in the TreeSet is = "+ts.first()); 
    System.out.println("Please Enter how many Elemnst you want to delete");
    int size1 = sc.nextInt();
    for(int i=0;i<size1;i++)
    {
      System.out.println("Please  Enter the lement you want to delete");
      int element=sc.nextInt();
      ts.remove(element);
    }
    Iterator<Integer> it2=ts.iterator();
    System.out.println("The Elements after being removed from treeSet");
    while(it2.hasNext())   
    System.out.println(it2.next());
    System.out.println("The Lowest Element Which is being Removed is = "+ts.pollFirst());
    System.out.println("The Highest Element Which is being Removed is = "+ts.pollLast());
    Iterator<Integer> it3=ts.iterator();
    while(it3.hasNext())   
    System.out.println(it3.next());
}
  public static void main(String[] args)
  {
   method();    
  }
}