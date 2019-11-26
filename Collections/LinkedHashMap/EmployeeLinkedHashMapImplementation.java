import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
class EmployeeLinkedHashMapImplementation
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter how many Employee Details You want to enter");
    int size = sc.nextInt();
    EmployeeLinkedHashMapExample employeeArray[] = new EmployeeLinkedHashMapExample[size];
    LinkedHashMap map = new LinkedHashMap();
    for(int i = 0;i<employeeArray.length;i++)
    employeeArray[i]= new EmployeeLinkedHashMapExample();
    for(int i=0;i<employeeArray.length;i++)
    {
      System.out.println("Please Enter EmployeeId");
      employeeArray[i].employeeId = sc.nextInt();  
      System.out.println("Please Enter EmployeeName");
      employeeArray[i].employeeName = sc.next();
      System.out.println("Please Enter EmployeeSalary");
      employeeArray[i].employeeSalary = sc.nextFloat();
    }
    for(int i = 0;i<employeeArray.length;i++)
    map.put(employeeArray[i].getEmployeeId(),employeeArray[i]);
    System.out.println("employeeId" + " " + "employeeName" + " "+ "employeeSalary");
    Set entries = map.entrySet();
    for(Object enter:entries)
    {
     Entry entry =(Entry)enter;
     System.out.println(entry.getKey()+" "+entry.getValue());
    }
    System.out.println("Please Select the Employee Id whose details which you wish to delete");
    int id=sc.nextInt();
    map.remove(id);
    System.out.println("after Removal Operation"+ " " +"employeeId" + " " + "employeeName" + " "+ "employeeSalary");
    Set keys=map.keySet();
    for(Object o:keys)
    System.out.println(map.get(o));
  }
}