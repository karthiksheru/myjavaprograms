import java.util.Scanner;
import java.util.Stack;
import java.util.ListIterator;
class StackExample
{
  public static void main(String[]  args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter the how manys Element you want to add into stack");
    int size=sc.nextInt();
    System.out.println("Please Enter "+size+" elements");
    Stack<Integer> st=new Stack<>(); 
    for(int i = 0;i<size;i++)
    {
      int x = sc.nextInt();
      st.push(x);
    }
    System.out.println("The first element in the stack is = "+st.peek());
    ListIterator<Integer> li = st.listIterator();
    System.out.println("The size of the stack is = "+st.size());
    System.out.println("The Total Elements present in stack are = ");
    while(li.hasNext()) 
    System.out.print(li.next()+"\t");
    System.out.println("\n"+"Enter how many Elments you want to remove from stack");
    int remove = sc.nextInt();
    for(int i = 0;i<remove;i++)
    {
     st.pop();
    }
    System.out.println("The Elements present in stack after performing stack Operation are");
    ListIterator<Integer> li2=st.listIterator();
    while(li2.hasNext())
    System.out.print(li2.next()+"\t");
    System.out.println("\n"+"After performing all operations is the stack empty? = "+st.empty());
    System.out.println("Select any Entered Element whose you want to kknow the desired position");
    int elementPostition=sc.nextInt();
    int value = st.search(elementPostition);
    System.out.println("The position of "+elementPostition+" in stack is = "+value);
  }
}