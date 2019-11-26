import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
class ArrayListExample1<T> extends ArrayList<Integer>
{
  public void arrayListMethod()
  {    
    Scanner sc=new Scanner(System.in);
    ArrayListExample1<Integer> a1 = new ArrayListExample1<>();
    System.out.println("Please enter how many Elements you want to add into the ArrayList");
    int length=sc.nextInt();
    System.out.println("Please Enter the "+length+" Elements");
    for(int i = 0;i<length;i++)
    {
      int x=sc.nextInt();
      a1.add(x);   
    } 
    System.out.println("Select Any of the following options");
    System.out.println("1-> Remove any particular element");
    System.out.println("2-> To Remove Elements of any desired range");
    System.out.println("3-> To clear the list");
    System.out.println("4-> Iterate Elements in the Arraylist using forEach Loop");
    System.out.println("5-> Iterate the elements in the ArrayList using for loop");
    System.out.println("6-> Iterate the elements in the ArrayList using ListIterator Interface");
    System.out.println("7-> Iterate the elements in the ArrayList using Iterator Interface");
    int option=sc.nextInt();
    switch(option)
    {
      case 1  : System.out.println("Please Enter which element index you want");
                int x = sc.nextInt();
                a1.remove(x);
                break;
      case 2  : System.out.println("Please Enter the fromRange and toRange you want to Enter");
                int fromIndex = sc.nextInt();
                int toIndex = sc.nextInt();
                a1.removeRange(fromIndex,toIndex);
                break;
      case 3  : a1.clear();
                break; 
      case 4  : System.out.println("The Elemnts are being iterated by using for loop");
                for(Object o:a1)
                System.out.println(o);
                break;
      case 5  : System.out.println("The Elements are being iterated by using for loop");
                for(int i=0;i<a1.size();i++)
                System.out.println(a1.get(i));
                break;
      case 6  : ListIterator it=a1.listIterator();
                System.out.println("The Elements are being displayed in forward direction");
                while(it.hasNext())
                {
                  System.out.println(it.next());
                }
                System.out.println("The elemnts are being traversed in forward direction");
                while(it.hasPrevious())
                { 
                  System.out.println(it.previous()); 
                }
                break;
      case 7   :Iterator itr =a1.iterator();
                System.out.println("The Elements Being iterated in forward direction");
                while(itr.hasNext())
                {
                  System.out.println(itr.next());
                }
                System.out.println("The Elements are being iterarted in reverse direction");
                break;
      default : System.out.println("Please enter a valid option");
    }
    System.out.println("Therefore the ArrayListDetails after performing operation are");
    System.out.println(a1);
    System.out.println("The Number of elements in the ArrayList are = "+a1.size());
  }
  public static void main(String[] args)
  {
    ArrayListExample1 a=new ArrayListExample1(); 
    a.arrayListMethod();
  }
}