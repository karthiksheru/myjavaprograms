import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.NavigableMap;
import java.util.Set;
class EmployeeTreeMapImplementation
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter how many Employee Details You want to enter");
    int size = sc.nextInt();
    EmployeeLinkedHashMapExample employeeArray[] = new EmployeeLinkedHashMapExample[size];
    TreeMap map = new TreeMap();
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
    System.out.println("Getting Reverse Order using descendingKeyMap()");
    NavigableMap ee = map.descendingMap();
    Set e =ee.keySet();
    for(Object o:e)
    System.out.println(map.get(o));
    NavigableSet entries = map.descendingKeySet();
    System.out.println("Getting Reverse Order using descendingKeySet()");
    for(Object enter:entries)
    {
     System.out.println(map.get(enter));
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