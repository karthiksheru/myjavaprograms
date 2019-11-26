import java.util.Scanner;
class Employee1
{
  private String firstName;
  private String lastName;
  private int employeeId;
  private String currentWorkLocation;
  public void setFirstName(String firstName)
  {
    this.firstName=firstName;
  }
  public String getFirstName()
  {
    return firstName;
  }
  public void setLastName(String lastName)
  {
    this.lastName=lastName;
  }
  public String getLastName()
  {
    return lastName; 
  }
  public void setEmployeeId(int employeeId)
  {
    this.employeeId=employeeId;
  }
  public int getEmployeeId()
  {
    return employeeId;
  } 
  public void setCurrentWorkLocation(String currentWorkLocation)
  {
    this.currentWorkLocation=currentWorkLocation;
  }
  public String getCurrentWorkLocation()
  {
    return currentWorkLocation;
  }
  public void display()
  {
   System.out.println("The First Name of Employee is = "+firstName);
   System.out.println("The Last Name of employee is = "+lastName);
   System.out.println("The Employee Id of employee is = "+employeeId);
   System.out.println("The Employee location is = "+currentWorkLocation);
  }
  public static void main(String[] args)
  { 
   Scanner sc=new Scanner(System.in);
   Employee1 emp1=new Employee1();
   System.out.println("Please Enter Your First Name");
   String fname=sc.next(); 
   System.out.println("Please Enter Your Last Name");
   String lname=sc.next();
   System.out.println("Please Enter Your EmployeeId"); 
   int empId=sc.nextInt();
   System.out.println("Please Enter Your Current Job Location");
   String location=sc.nextLine();
   emp1.setFirstName(fname);
   emp1.setLastName(lname);
   emp1.setEmployeeId(empId);
   emp1.setCurrentWorkLocation(location);
   emp1.display();
 }
}