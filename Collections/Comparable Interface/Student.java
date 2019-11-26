public class Student implements Comparable<Student>
{
  int studentId;
  String studentName;
  String studentLocation;
  float studentCGPA;
  public int getStudentId()
  {
    return studentId;
  }
  public String getStudentName()
  {
    return studentName;
  }
  public String getStudentLocation() 
  {
    return studentLocation;
  } 
  public Float getStudentCGPA()
  {
    return studentCGPA;
  }
  public String toString()
  {
   return studentId + " " +studentName + " " +studentLocation + " " +studentCGPA;
  }
  public int compareTo(Student obj)
  {
    if(studentId == obj.studentId)
    return 0;
    else if(studentId > obj.studentId)
    return 1;
    else
    return -1;
  }
}