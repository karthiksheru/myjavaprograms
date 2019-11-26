import java.util.Scanner;
class AssertionExample
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter Your Weight");
    int weight = sc.nextInt();
    assert weight>=20 : "You are under weight";
    System.out.println("You weight is stable");   
   
  }
}