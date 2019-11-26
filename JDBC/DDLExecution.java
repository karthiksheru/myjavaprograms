import org.h2.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
class A
{
  public void createTable()
  {
    try
    {
      Class.forName("org.h2.Driver");
      Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/hibernate-example","sa","sa");
      Statement stmt=con.createStatement();
      System.out.println("Please enter the table name You want to create");
      Scanner sc=new Scanner(System.in);
      String tableName=sc.next();
      int i=stmt.executeUpdate("create table "+tableName+"(sno int,schoolName varchar(20))");  
      System.out.println(i);
      if(i==0)
      System.out.println("Your table is being created");
      else
      System.out.println("Yoyr table is not being created");
  }catch(Exception a)
     {
       System.out.println(a);
     }
  }
  public void dropTable()
  {
    try
    {
      Class.forName("org.h2.Driver");
      Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/hibernate-example","sa","sa");
      Statement stmt=con.createStatement();
      System.out.println("Please Enter the table name which you want to drop");
      Scanner sc=new Scanner(System.in);
      String tableName=sc.next();
      int i=stmt.executeUpdate("drop table "+tableName+" ");
      System.out.println(i);
      if(i==0)
      System.out.println("The table named as "+tableName+" is being dropped");
      else
      System.out.println("The table named as "+tableName+" does not exists");
 }catch(Exception a)
     {
      System.out.println(a);
     } 
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter your choice a for creation for table and b for droping of table");
    char choice=sc.next().charAt(0);
    A c=new A();
    switch(choice)
    {
      case 'a':c.createTable();
               break;
     case 'b':c.dropTable();
              break;
     default:System.out.println("Please Enter either a or b");
             break;
    }
  }
}