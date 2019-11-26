import java.util.Scanner;
class Rectangle extends Shape
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Rectangle r=new Rectangle();
    System.out.println("Please Enter The Length of Rectangle");
    r.length=sc.nextInt();
    System.out.println("Please Enter the Breadth of Rectangle");
    r.breadth=sc.nextInt();
    System.out.println("Click 1 for finding area or 2 for finding perimeter of a Rectangle");
    int number=sc.nextInt();
    switch(number)
    {
     case 1:r.areaRectangle();
            break;
     case 2:r.perimeterRectangle();
            break;
     default:System.out.println("Please Enter a valid option");
              break; 
    }
  }
}