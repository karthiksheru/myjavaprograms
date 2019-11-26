import java.util.Scanner;
class Outer
{
  int x;
  static int y;
  int z = 35;
  static class Inner
  {
    Inner()
    {
      Outer out = new Outer();
      System.out.println("The value of x is = "+out.x); // You will get zero
      System.out.println("The value of y is = "+y);
      System.out.println("The valu of z is = "+out.z);
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter the value of x");
    Outer out =new Outer();
    out.x = sc.nextInt();
    System.out.println("Please Enter the value of y");
    y = sc.nextInt();
    Outer.Inner in = new Outer.Inner(); 
  }
}