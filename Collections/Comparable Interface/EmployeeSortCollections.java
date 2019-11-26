import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class EmployeeSortCollections
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter how many Employee Details You want to Enter");
    int size = sc.nextInt();
    Employee employeeArray[] = new Employee[size];
    for(int i = 0;i<employeeArray.length;i++)
    employeeArray[i] = new Employee();
    for(int i = 0;i<employeeArray.length;i++)
    {
      System.out.println("Please Enter Employee Id");
      employeeArray[i].employeeId = sc.nextInt();
      System.out.println("Please Enter Employee Name ");
      employeeArray[i].employeeName = sc.next();
      System.out.println("Please Enter Employee Location");
      employeeArray[i].employeeWorkLocation = sc.next();
      System.out.println("Please Enter Employee Salary"); 
      employeeArray[i].employeeSalary = sc.nextFloat();
    }
    ArrayList<Employee> al = new ArrayList<>();
    for(int i = 0;i<employeeArray.length;i++)
    al.add(employeeArray[i]);
    System.out.println("The EmployeeDetails  are");
    for(Employee emp1:al)
    System.out.println(emp1); // when you print object you will get hash code but jvm internally calls the toString() method 
                              //If you over-ride Your object values are printed.
    Collections.sort(al);
    System.out.println("The Employee details are arranged in order of Ids");
    for(Employee emp2:al)
    System.out.println(emp2);
    Collections.sort(al,new EmployeeLocationCompartor());
    System.out.println("The Employee Details are arranged as per alphabetical order of work Location");
    for(Employee emp3:al)
    System.out.println(emp3);
    System.out.println("The Employee Details are arranged as per higer salaries");
    Collections.sort(al,new EmployeeSalaryComparator());
    for(Employee emp4:al)
    System.out.println(emp4);
  }
}