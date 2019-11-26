import java.util.Scanner;
class AssertionExample2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter Your age");
    int age = sc.nextInt();
    assert age>=18 : "You are Not Elgible To vote";
    System.out.println("You are Elgible To Vote");
    assert age<=54 : "You are Over aged";
    System.out.println("You can vote");
  }
}