import java.util.Scanner;
class EmployeeCollection
{
  Employee employeeArray[];
  public EmployeeCollection()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("please Enter how many Employee Details You want to Enter");
    int size = sc.nextInt();
    employeeArray=new Employee[size];
    for(int i=0;i<employeeArray.length;i++)
    employeeArray[i]=new Employee();
    for(int i=0;i<employeeArray.length;i++)
    { 
      System.out.println("Please Enter Employee Id");
      employeeArray[i].employeeId = sc.nextInt();
      System.out.println("Please Enter Employee Name");
      sc.nextLine();
      employeeArray[i].employeeName = sc.nextLine();
      System.out.println("Please Enter Employee Adrress");
      employeeArray[i].employeeAddress = sc.nextLine(); 
      System.out.println("Please Enter Employee Salary");
      employeeArray[i].employeeSalary = sc.nextFloat();
    }
    for(int i=0;i<employeeArray.length;i++)
    {
      int j=i+1;
      System.out.println("The details of employee"+j+" is ");
      employeeArray[i].showDetails();
    }
  }
  public static void main(String[] args)
  {
    EmployeeCollection m1=new EmployeeCollection();
  }
}