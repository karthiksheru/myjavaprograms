class EmployeeLinkedHashMapExample
{
  int employeeId;
  String employeeName;
  float employeeSalary;
  public int getEmployeeId()
  {
    return employeeId;
  }
  public String getEmployeeName()
  { 
    return employeeName;
  }
  public float getEmployeeSalary()
  {
    return employeeSalary;
  }
  public String toString()
  {
    return employeeId + " " + employeeName + " "+ employeeSalary; 
  }
}