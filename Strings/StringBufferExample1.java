import java.util.Scanner;
class A
{
  public static void main(String[] args)
  { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter A String");
    String value1 = sc.nextLine();
    System.out.println("Please Enter A String");
    String value2 = sc.nextLine();
    StringBuffer sb = new StringBuffer(value1);
    sb.append(" "+value2);
    System.out.println("The appended value is =  "+sb);
    sb.insert(5,"@");
    System.out.println("The inserted Value is = "+sb);
    sb.replace(3,5,"%");
    sb.delete(4,8);
    System.out.println("The deleted valus = "+sb);
    sb.reverse();
    System.out.println(sb);
  }
}