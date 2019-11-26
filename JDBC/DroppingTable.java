import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import org.h2.Driver;
class A
{
  public static void main(String[] args)
  {
    try
    {
      Class.forName("org.h2.Driver");
      Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/hibernate-example","sa","sa");
      Statement stmt=con.createStatement();
      boolean data=stmt.execute("drop table students");
      if(data==false)
      System.out.println("Your Table is being droped");
      else
      System.out.println("Your Table is not being droped");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
  }
}
