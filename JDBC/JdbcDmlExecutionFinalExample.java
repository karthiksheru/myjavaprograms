import java.sql.ResultSet;
import java.util.Scanner;
import org.h2.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.DatabaseMetaData;
class A
{
  public Connection establishingConnection()
  {
    try
    {
      Class.forName("org.h2.Driver");
      Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/hibernate-example","sa","sa");
      return con; 
    }
    catch(Exception e)
    {
      System.out.println(e);
      return null; //In catch block also u must retur otherwise it throws error.
    }
  }
  public void GettingInternalStructureOfTable()
  { 
    try
    {
      Connection con=establishingConnection();
      PreparedStatement pstmt=con.prepareStatement("select * from student");
      ResultSet rs=pstmt.executeQuery();
      ResultSetMetaData rsmd=rs.getMetaData();
      System.out.println("The table Name is = "+rsmd.getTableName(1));
      System.out.println("The total Number of columns in table is = "+rsmd.getColumnCount());
      for(int i=1;i<rsmd.getColumnCount()+1;i++)
      {
        System.out.println("The Name of Column"+i+" is = "+rsmd.getColumnName(i));
        System.out.println("The datatype of column"+i+" is = "+rsmd.getColumnTypeName(i));
      }
     }
    catch(Exception ie)
    {
      System.out.println(ie);
    }
  }
  public void insertingDataIntoTable()
  {
    try
    {
      Connection con=establishingConnection();
      System.out.println("\t"+ "\t" +"\t" + "\t" + "Please Insert data into the table");
      Scanner sc=new Scanner(System.in);
      System.out.println("Please Enter the Student Id");
      int studentId=sc.nextInt();
      System.out.println("Please Enter the Student Name");
      String studentName=sc.next();
      System.out.println("Please Enter the student Location");    
      String studentLoc=sc.next();
      String studentLocation=studentLoc.substring(0,1).toUpperCase()+studentLoc.substring(1); //To mak e the first letter as Capital Letter
      System.out.println("Please Enter the student Gpa");
      float studentGpa=sc.nextFloat();
      PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?)");
      pstmt.setInt(1,studentId);
      pstmt.setString(2,studentName);
      pstmt.setString(3,studentLocation);
      pstmt.setFloat(4,studentGpa);
      int i=pstmt.executeUpdate();
      if(i>0)
      System.out.println("The Details have been inserted sucessfully");
      else
      System.out.println("The Details have not been inserted");
    }
    catch(Exception e)
    {
       System.out.println(e);
    }
  }
  public void updatingDetailsInATable()
  {
    try
    {
     Connection con=establishingConnection();
     System.out.println("\t"+"\t"+"\t"+"Please Update Data which you want to Perform");
     System.out.println("Please Enter the column name through which you want to update");
     Scanner sc=new Scanner(System.in);
     String colName=sc.next();
     System.out.println("Please Enter the old value");
     String oldValue=sc.next();
     System.out.println("please Enter new Value");
     String newValue=sc.next();
     PreparedStatement pstmt=con.prepareStatement("update student set "+colName+"=? where "+colName+"=?");
     //here the instead of ?== if you keep any variable you hava to use '""';
     pstmt.setString(1,newValue); 
     pstmt.setString(2,oldValue);
     int i=pstmt.executeUpdate();
     if(i>0)
     System.out.println("The data has been updated");
     else
     System.out.println("The data has not been updated");
    }catch(Exception e)
     {
       System.out.println(e);
     }
  }
  public void deletingDetails()
  {
    try
    {
     Connection con=establishingConnection();
     System.out.println("\t"+"\t"+"\t"+"Please Delete The data which you want to perform");
     System.out.println("Please Enter the colname through which u want to delete");
     Scanner sc=new Scanner(System.in);
     String colName=sc.next();
     System.out.println("Please Enter The value through which u want those records to delete");
     String value=sc.next();
     PreparedStatement pstmt=con.prepareStatement("delete from student where "+colName+"=?");
     pstmt.setString(1,value);
     int i=pstmt.executeUpdate();
     if(i>0)
     System.out.println("The details have been deleted");
     else
     System.out.println("The details have not been deleted"); 
   }catch(Exception e)
    {
     System.out.println(e);
    }
  }
  public void showingDataOnConsole()
  {
    try
    {
     System.out.println("\t"+"Showing The data that has been retrived from the database");
     Connection con=establishingConnection();
     Statement stmt=con.createStatement();
     Scanner sc=new Scanner(System.in);
     System.out.println("Please enter the table name which you want to see on console");
     String tableName=sc.next();
     System.out.println("\t"+"StudentId" +"\t"+ "StudentName"+ "\t"+"StudentLocation" +"\t"+ "StudentGPA");
     ResultSet rs=stmt.executeQuery("select * from "+tableName+" ");
     while(rs.next())
     { 
       System.out.println("\t"+rs.getString("studentId")+"\t" +"\t"+rs.getString("studentName")+ "\t"+"\t"+rs.getString("studentLocation")+ "\t"+rs.getString("studentGpa"));
     }
    }catch(Exception w)
     {
      System.out.println(w);
     }
  }
  public void gettingInternalStructureOfDatabase()
  {
    try
    {
     Connection con=establishingConnection();
     DatabaseMetaData dbmd=con.getMetaData();
     System.out.println("The name of the database is = "+dbmd.getDatabaseProductName());
     System.out.println("The version of the database is = "+dbmd.getDatabaseProductVersion());
     System.out.println("The drivername is = "+dbmd.getDriverName());
     System.out.println("The driver version is = "+dbmd.getDriverVersion());
     System.out.println("The userName is = "+dbmd.getUserName());
   }catch(Exception e)
     {
       System.out.println(e);
     }
  }
  public static void main(String[] args)
  {
    A a=new A();
    System.out.println("Please Enter ur choice");
    Scanner sc=new Scanner(System.in);
    System.out.println("\t"+"\t"+ "0.->GettingInternalStructureOfTable"+"\t"  +"1.->Insertion" + "\t" + "2.->Updation" + "\t"+ "3.->Deletion"+ "\t" + "4.->showingDataOnConsole"+"\t"+"5.->gettingInternalStructureOfDatabase");
    int choice=sc.nextInt();
    switch(choice)
    {
      case 0 : a.GettingInternalStructureOfTable();
               break;
      case 1 : a.insertingDataIntoTable();
               break;
      case 2 : a.updatingDetailsInATable();
               break;
      case 3 : a.deletingDetails();
               break;
      case 4 : a.showingDataOnConsole();
               break;
      case 5 : a.gettingInternalStructureOfDatabase();
               break;
     default : System.out.println("Please Enter a valid option");
               break;
    }
  }
}