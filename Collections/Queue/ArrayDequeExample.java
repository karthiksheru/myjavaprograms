import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Iterator;
class ArrayDequeExample
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter the size of ArrayDeque");
    int size=sc.nextInt();
    ArrayDeque<String> ad=new ArrayDeque<>();
    System.out.println("Please Enter "+size+" Elements");
    for(int i=0;i<size;i++)
    {
      String x=sc.next();
      ad.add(x);
    } 
    Iterator<String> it1 = ad.iterator();
    while(it1.hasNext())
    System.out.println(it1.next());
    System.out.println("The Head of the ArrayDeque is = "+ad.element());
    System.out.println("Select your choice 1->Add Element From Head Side");
    System.out.println("2->Add Element from Tail Side");
    int choice=sc.nextInt();
    System.out.println("Please Enter an element which you want to add from desired side");
    String item=sc.next();
    if(choice==1)
    ad.addFirst(item);
    else if(choice==2)
    ad.addLast(item);
    else
    System.out.println("Please Enter a valid number and Your opertion is not being performed");
    System.out.println("The Elements of Queue after addition of element is ");
    Iterator<String> it2 = ad.iterator();
    while(it2.hasNext())
    System.out.println(it2.next());
    System.out.println("Select your choice 1->Remove Element From Head Side");
    System.out.println("2->Remove Element from Tail Side");
    int choice2=sc.nextInt();
    if(choice2==1)
    ad.removeFirst();
    else if(choice2==2)
    ad.removeLast();
    else
    System.out.println("Please Enter a valid number");
    System.out.println("The Elements of Queue after remove operation is ");
    Iterator<String> it3 = ad.iterator();
    while(it3.hasNext())
    System.out.println(it3.next());
  }
}