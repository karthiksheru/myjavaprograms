import java.util.Comparator;
class StudentCGPAComparator implements Comparator<Student>
{
  public int compare(Student obj1,Student obj2)
  {
    if(obj1.studentCGPA > obj2.studentCGPA) 
    return 1;
    else if(obj1.studentCGPA < obj2.studentCGPA)
    return -1;
    else
    return 0; 
  }
}