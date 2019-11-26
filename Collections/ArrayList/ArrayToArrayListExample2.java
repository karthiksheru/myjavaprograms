import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ListIterator;
import java.util.List;
class ArrayToArrayListExample2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the size of string array And Integer");
    int size=sc.nextInt();
    String s1[]=new String[size];
    Integer i1[]=new Integer[size];
    System.out.println("Please enter "+s1.length+" String elements");
    for(int i = 0;i<s1.length;i++)
    s1[i]=sc.next();
    List<String> arrayList1=Arrays.asList(s1); //returns List object
    System.out.println("The String values which you have entered are");
    for(Object a:arrayList1)
    System.out.println(a);
    System.out.println("Please Enter "+s1.length+" Int Elements");
    for(int j = 0;j<i1.length;j++)
    i1[j]=sc.nextInt(); 
    List<Integer> arrayList2=Arrays.asList(i1); //returns List Object
    System.out.println("The Integer values which u entered are");
    for(Object b:arrayList2)
    System.out.println(b); 
 }
}