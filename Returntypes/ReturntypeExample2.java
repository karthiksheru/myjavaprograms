import java.util.Scanner;
class A
{
 public float subtraction(float num1,float num2)
 {
   float z=num1-num2;
   return z;
 }
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Please Enter The value of first Number");
   float num1=sc.nextFloat();
   System.out.println("Please Enter The value of second Number");
   float num2=sc.nextFloat();
   A a=new A();
   float result=a.subtraction(num1,num2);
   System.out.println("The subtraction of two numbers is = "+result);
 }
}