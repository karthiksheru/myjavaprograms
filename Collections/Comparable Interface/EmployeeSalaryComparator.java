import java.util.Comparator;
class EmployeeSalaryComparator implements Comparator<Employee>
{
  public int compare(Employee emp1,Employee emp2)
  {
    if(emp1.employeeSalary < emp2.employeeSalary)
    return 1;
    else if(emp1.employeeSalary > emp2.employeeSalary)
    return -1;
    else
    return 0;
  }
}