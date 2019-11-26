import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.h2.Driver;
class A
{
  public Connection method()
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
       return null;
     }
 }
  public void insertingDetails()
  {
    try
    { 
     Connection con=method();
     PreparedStatement pstmt=con.prepareStatement("insert into user values(?,?,?,?)");
     Scanner sc=new Scanner(System.in);
     System.out.println("Please Enter the IdNumber");
     int sno=sc.nextInt();
     System.out.println("please enter the first Name");
     String firstName=sc.next();
     System.out.println("please enter the Last Name");
     String lastName=sc.next();
     System.out.println("please enter the Location");
     String location=sc.next();
     pstmt.setInt(1,sno);
     pstmt.setString(2,firstName);
     pstmt.setString(3,lastName);
     pstmt.setString(4,location);
     int i=pstmt.executeUpdate();    
     System.out.println(i);
     if(i>0) 
     System.out.println("The data is being inserted into the table");
     else
     System.out.println("The data is not being inserted into the table"); 
     System.exit(0); 
   }catch(Exception a)
     {
       System.out.println(a);
     }
   }
   public void retrivingDataOfSpecificLocation()
   {
     try 
     {
       Connection con=method();
       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter the location");
       String location=sc.next();
       PreparedStatement pstmt=con.prepareStatement("select * from user where location='"+location+"'");
       ResultSet rs=pstmt.executeQuery();      
       System.out.println("First Name" +" "+ "Last Name"+ " " +"Location");
       System.out.println(rs);
       while(rs.next())
       {
         System.out.println(rs.getString("firstName") + " "+ rs.getString("lastName") +" "+rs.getString("location"));
       }
     }catch(Exception e)
      {
        System.out.println(e);
      }
   }
   public void deletingExistingData()
   {
        try
        {
         Connection con=method();
         Scanner sc=new Scanner(System.in);
         System.out.println("Please enter which column name of the table based on which you eant to delete");
         String colName=sc.next();
         System.out.println("Please enter which New Value which you want to replace");
         String value=sc.next();
         PreparedStatement pstmt=con.prepareStatement("delete from user where '"+colName+"'=?");
         pstmt.setString(1,value);
         int i=pstmt.executeUpdate();
         if(i>0) 
         System.out.println("The rows are being deleted successfuly");
         else
         System.out.println("The rows are not being deleted succesffuly");
       }catch(Exception e)
        {
          System.out.println(e);
        } 
  }
   public void updatingExistingData()
   {
     try
     {
        Connection con=method();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter which column name of the table which you want to update");
        String colName=sc.next();
        System.out.println("Please enter which New Value which you want to replace");
        String newValue=sc.next();
        PreparedStatement pstmt=null;
        if(colName.equals("location"))
        pstmt=con.prepareStatement("update user set location='"+newValue+"' where location="+colName+"");
        if(colName.equals("firstName"))
        pstmt=con.prepareStatement("update user set firstName='"+newValue+"' where firstName="+colName+"");
        if(colName.equals("lastName"))
        pstmt=con.prepareStatement("update user set lastName='"+newValue+"' where lastName="+colName+"");
        int i=pstmt.executeUpdate();
        if(i>0)
        System.out.println("The table has being updated sucessfully");
        else
        System.out.println("The table hasn't been updated");
     }catch(Exception e)
      {
        System.out.println(e);
      }
   }
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Please select any option 1-->Insert Data into table      2-->Show Entire Data of table 3-->Update Existing Data");
       int ch=sc.nextInt();
       A a=new A();
       switch(ch)
       {
         case 1 : a.insertingDetails();
                  break;
         case 2 : a.retrivingDataOfSpecificLocation();
                  break;
         case 3 : a.updatingExistingData();
                  break;
         case 4 : a.deletingExistingData();
                  break;
        default : System.out.println("Please Enter a valid option");
                  break;
      }
   } 
}