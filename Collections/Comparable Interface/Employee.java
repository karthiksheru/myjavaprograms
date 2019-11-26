class Employee  implements Comparable<Employee>
{
  int employeeId;
  String employeeName;
  String employeeWorkLocation;
  float employeeSalary;
  public String toString()
  {
     return employeeId+" "+employeeName+" "+employeeWorkLocation+" "+employeeSalary; 
  }
  public int compareTo(Employee obj1)
  {
    if(employeeId > obj1.employeeId)
    return 1;
    else if(employeeId < obj1.employeeId) 
    return -1;
    else
    return 0;
  }
}