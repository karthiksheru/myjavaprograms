import java.util.Scanner;
class A
{
 A method()
 {
   System.out.println("This Method Consists of class as return type");
   A a=new A();
   return a;
 }
 public static void main(String[] args)
 {
   A a=new A();
   a=a.method();
   System.out.println("The A class Method returns ="+a);
 }
}