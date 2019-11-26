import java.util.Comparator;
class StudentLocationComparator implements Comparator<Student>
{
  public int compare(Student obj1,Student obj2)
  {
     return obj.studentLocation.compareTo(obj2.studentLocation);
  }
}