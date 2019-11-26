import java.util.Scanner;
class Example1
{
  private String firstName;
  public void setFirstName(String firstName)
  {
     this.firstName=firstName;
  }
  public String getFirstName()
  {
    return firstName;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Example1 a=new Example1();
    System.out.println("Enter your First Name");
    String fname=sc.next();
    a.setFirstName(fname);
    String result=a.getFirstName();
    System.out.println("The Entered First Name is = "+result);
  }
}
