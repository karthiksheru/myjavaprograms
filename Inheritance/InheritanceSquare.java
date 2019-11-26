import java.util.Scanner;
class Square extends Shape
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The value of side");
    Square sq=new Square();
    sq.side=sc.nextInt();
    System.out.println("Select 1 to find area or select 2 to find perimeter");
    int number=sc.nextInt();
    switch(number)
    {
      case 1:  sq.areaSquare();
               break;
      case 2:  sq.perimeterSquare();
               break; 
      default: System.out.println("Please Enter a valid option");
               break;
     }
  }
}