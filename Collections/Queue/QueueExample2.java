import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Iterator;
class QueueExample2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter How many Elements You want to enter into Queue");
    int size=sc.nextInt();
    PriorityQueue<String> queue = new PriorityQueue<>();
    System.out.println("Please Enter "+size+" Elements");
    for(int i=0;i<size;i++)
    {
      String x=sc.next();
      queue.offer(x); //You can either use add() or offer();
    }
   System.out.println("The head of the queue is = "+queue.element());
   Iterator<String> it1 = queue.iterator();
   System.out.println("The Elements Entered in the queue are:-");
   while(it1.hasNext())
   System.out.println(it1.next());
   System.out.println("Please Enter how many elements you want to remove from the queue"); 
   int remove = sc.nextInt();
   for(int i = 0;i<remove;i++)
   queue.remove();
   Iterator<String> it2 = queue.iterator();
   while(it2.hasNext())
   System.out.println(it2.next());
  }
}