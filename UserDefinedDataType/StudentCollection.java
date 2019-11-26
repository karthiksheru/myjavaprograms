import java.util.Scanner;
import java.util.Scanner;
class StudentCollection
{
  Student studentArray[];
  public StudentCollection()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Please Enter how many number of Student details you want to enter");   
     int size=sc.nextInt();
     studentArray=new Student[size];
     for(int i=0;i<studentArray.length;i++)
     studentArray[i]=new Student();
     System.out.println("Please Enter the details");
     for(int i=0;i<studentArray.length;i++)
     {
       System.out.println("Please Enter student ID");
       studentArray[i].studentId=sc.nextInt();   
       sc.nextLine();
       System.out.println("Please Enter the student Name");
       studentArray[i].studentName=sc.nextLine();
       System.out.println("Please Enter the student address");   
       studentArray[i].studentAddress=sc.nextLine();
       System.out.println("Plesae Enter the student CGPA");
       studentArray[i].studentCGPA=sc.nextFloat();
     }
     for(int i=0;i<studentArray.length;i++)
     { 
       int j=i+1;
       System.out.println("The Details of student"+j+"");
       studentArray[i].showDetails();
     }
  } 
  public static void main(String[] args) 
  {
    StudentCollection m1=new StudentCollection(); 
  }
}