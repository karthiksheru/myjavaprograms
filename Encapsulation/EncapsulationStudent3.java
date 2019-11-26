import java.util.Scanner;
class Student3
{
  public static void main(String[] args) 
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Please Enter your Name");
   String sname=sc.nextLine();
   System.out.println("Please Enter your Id Number");
   int id=sc.nextInt();
   System.out.println("please Enter your CGPA");
   float gpa=sc.nextFloat(); 
   Student1 st3=new Student1(); 
   st3.setStudentName(sname);
   st3.setStudentId(id);
   st3.setStudentGPA(gpa);
   st3.display();
 }
}