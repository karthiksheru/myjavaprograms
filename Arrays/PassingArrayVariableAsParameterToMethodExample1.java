import java.util.Scanner;
class A
{
  public void method1(int x[])
  {
    System.out.println("The Entered "+x.length+" elements of array are");
    for(int a:x)
    {
      System.out.println(a);
    }
  }
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the size of the array");
    int size=sc.nextInt();
    int x[]=new int[size];
    System.out.println("Please Enter "+x.length+" in the array");
    for(int i=0;i<x.length;i++)
    x[i]=sc.nextInt();
    A a=new A();
    a.method1(x);
  }
}