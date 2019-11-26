import java.util.Comparator;
class EmployeeLocationCompartor implements Comparator<Employee>
{
  public int compare(Employee emp1,Employee emp2)
  {
    return emp1.employeeWorkLocation.compareTo(emp2.employeeWorkLocation);
  }
}