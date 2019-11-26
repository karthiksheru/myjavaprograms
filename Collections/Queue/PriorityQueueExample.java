import java.util.Scanner;
import java.util.Queue;
import java.util.Iterator;
import java.util.PriorityQueue;
//Queue even accepts null values as well as duplicate values.
class PriorityQueueExample
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter how many elements you want to add to the queue");
    int size=sc.nextInt();
    System.out.println("Please Enter "+size+" Elements");
    PriorityQueue<Integer> queue=new PriorityQueue();
    for(int i = 0;i<size;i++)
    {
     int x=sc.nextInt();
     queue.add(x);    
    }  
    System.out.println("The first Element of Queue is = "+queue.peek());
    Iterator it1=queue.iterator();
    System.out.println("The Elements of queue are");
    while(it1.hasNext())
    System.out.println(it1.next());
    System.out.println("Enter How many elments You want to remove from Queue");
    int remove = sc.nextInt();
    for(int i = 0;i<remove;i++)
    queue.poll();
    Iterator<Integer> it2=queue.iterator();
    System.out.println("The Elements of queue after performing all operations  are");
    while(it2.hasNext())
    System.out.println(it2.next());
  }
}