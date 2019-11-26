import java.util.Scanner;
class Employee2
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   Employee1 emp2=new Employee1();
   System.out.println("Please Enter Your First Name");
   String fname=sc.next(); 
   System.out.println("Please Enter Your Last Name");
   String lname=sc.next();
   System.out.println("Please Enter Your EmployeeId"); 
   int empId=sc.nextInt();
   System.out.println("Please Enter Your Current Job Location");
   String location=sc.nextLine();
   emp2.setFirstName(fname);
   emp2.setLastName(lname);
   emp2.setEmployeeId(empId);
   emp2.setCurrentWorkLocation(location);
   emp2.display();
 }
}