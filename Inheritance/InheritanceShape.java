import java.util.Scanner;
class Shape
{
  int length,breadth,side;
  public void areaRectangle()
  {
    int area=length*breadth;
    System.out.println("Area of Rectangle is = "+area);
  }
  public void perimeterRectangle()
  {
    int perimeter=2*(length+breadth);
    System.out.println("Perimeter of rectangle is = "+perimeter);
  }
  public void areaSquare()
  {
    int area=side*side;
    System.out.println("Area of Square is = "+area);
  }
  public void perimeterSquare()
  {
    int perimeter=4*side;
    System.out.println("The perimeter of square is = "+perimeter);
  }
}
