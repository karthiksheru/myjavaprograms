public class Student implements Comparable<Student>
{
  int studentId;
  char studentSection;   
  String studentName;
  String studentLocation;
  float studentCGPA;
  public int compareTo(Student obj)
  {
   if(studentId > obj.studentId)
   return 1;
   else if(studentId < obj.studentId) 
   return -1;
   else
   return 0; 
 }
  public String toString()
  {
   return studentId + " "+studentSection +" " +studentName + " " +studentLocation + " " +studentCGPA;
  }
}