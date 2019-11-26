import java.util.Scanner;
class A
{
  public static void main(String[] args)
  {
    try
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Please Enter the value of num");
     int number=sc.nextInt();
     String data=null;
     int divison=100/number;
     System.out.println("Hello");
     System.out.println("The String Length is = "+data.length());
    }catch(NullPointerException npe)
    {
     System.out.println(npe);
    }
    catch(ArithmeticException ae)
    {
      System.out.println(ae);
    } 
  }
}