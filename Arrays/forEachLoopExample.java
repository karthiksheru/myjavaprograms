import java.util.Scanner;
class A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the size of the array");
    int size=sc.nextInt();
    int x[]=new int[size];
    System.out.println("Please Enter "+size+" elements");
    for(int i=0;i<x.length;i++)
    {
       x[i]=sc.nextInt();
    }
    System.out.println("The Entered "+size+" elements of array");
    for(int z:x)
    { 
      System.out.println(z);
    }
  }  
}