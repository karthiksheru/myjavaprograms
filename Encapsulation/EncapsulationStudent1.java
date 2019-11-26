import java.util.Scanner;
class Student1
{
 private String studentName;
 private int studentId;
 private float studentGPA;
 public void setStudentName(String studentName)
 {
  this.studentName=studentName;
 }
 public String getStudentName()
 {
   return studentName;
 }
 public void setStudentId(int studentId)
 {
   this.studentId=studentId;
 }
 public int getStudentId()
 {
   return studentId;
 }
 public void setStudentGPA(float studentGPA)
 {
   this.studentGPA=studentGPA;
 }
 public float getStudentGPA()
 {
   return studentGPA;
 }
 public void display()
 {
   System.out.println("The Student Name is = "+studentName);
   System.out.println("The Student Id is = "+studentId); 
   System.out.println("The Student CGPA is  = "+studentGPA);
 }
 public static void main(String[] args) 
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Please Enter your Name");
   String sname=sc.nextLine();
   System.out.println("Please Enter your Id Number");
   int id=sc.nextInt();
   System.out.println("please Enter your CGPA");
   float gpa=sc.nextFloat(); 
   Student1 st1=new Student1(); 
   st1.setStudentName(sname);
   st1.setStudentId(id);
   st1.setStudentGPA(gpa);
   st1.display();
 }
}