import java.util.Scanner;
class Student2
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
   Student1 st2=new Student1(); 
   st2.setStudentName(sname);
   st2.setStudentId(id);
   st2.setStudentGPA(gpa);
   st2.display();
 }
}