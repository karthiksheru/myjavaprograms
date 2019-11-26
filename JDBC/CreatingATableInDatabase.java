import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import org.h2.Driver;
class A
{
  public static void main(String[] args)
  {
    try
    {
     Class.forName("org.h2.Driver");//registering the driver
     Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/hibernate-example","sa","sa");
     Statement stmt=con.createStatement();
     int data=stmt.executeUpdate("create table stu(id int,name varchar(20))");
     System.out.println(data);
     if(data>0)
     System.out.println("Your table is being created");
     else
     System.out.println("Your table is not created"); 
   }catch(Exception e)
    {
      System.out.println(e);
    }
 } 
}