import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
class HashSetExample
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter the size of the HashSet");
    int size = sc.nextInt();
    System.out.println("Please Enter "+size+" Elements");
    HashSet<String> hs=new HashSet<>();
    for(int i = 0;i<size;i++)
    {
      String x = sc.next();
      hs.add(x);
    }
    System.out.println("The Elements of HashSet are");
    Iterator<String> it=hs.iterator();   
    while(it.hasNext())
    System.out.println(it.next()); 
    System.out.println("Please Enter how many elements you want to remove");
    int size1 = sc.nextInt();
    for(int i = 0;i<size1;i++)
    {
      System.out.println("Please Enter name of item which you want to remove");
      String elements = sc.next();
      hs.remove(elements);
    }
    System.out.println("The size of the hashset after performing all operations are = "+hs.size());
    Iterator<String> it2 = hs.iterator();
    while(it2.hasNext())
    System.out.println(it2.next()); 
    System.out.println("Please Enter the Element whose presence you want to check in HashSet");   
    String element1 = sc.next();
    System.out.println("Is the entered "+element1+" is present in HashSet = "+hs.contains(element1));
 }
}