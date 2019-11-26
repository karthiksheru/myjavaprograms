import java.util.Scanner;
class A
{
  public static void main(String[] args)
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter Your Age");
    int age=sc.nextInt();
    if(age<18)
    throw new ArithmeticException("You are not eleigible to vote");
    else
    System.out.println("You are elgible to vote");
  }
}