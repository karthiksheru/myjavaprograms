import java.util.Scanner;
class A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter your Marks");
    int marks=sc.nextInt();
    if(marks<35)
    throw new ArithmeticException("You are not Qualified");
    else
    System.out.println("You are Qualified");
  }
}