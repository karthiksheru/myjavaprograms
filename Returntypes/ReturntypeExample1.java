import java.util.Scanner;
class A
{
  public int addition(int num1,int num2)
  {
    int z=num1+num2;
    return z; 
  }
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter the value of first Number");
    int num1=sc.nextInt();
    System.out.println("Please Enter The value of Next Number");
    int num2=sc.nextInt(); 
    A a=new A();
    int result=a.addition(num1,num2);
    System.out.println("The addition of two Numbers is = "+result); 
 }
}
  