import java.util.Scanner;
class StudentMapExample
{
  int studentId; 
  String studentName;
  int studentAge;
  public int getStudentId()
  {
    return studentId;
  }
  public String getStudentName()
  {
    return studentName;
  }
  public int getStudentAge()
  {
    return studentAge;
  }
  public String toString()
  {
    return studentId+" "+studentName+" "+studentAge; 
  }
}