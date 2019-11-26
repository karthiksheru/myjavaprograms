import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class CollectionsSortExample
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Please Enter how many Object You want to Enter");
     int size = sc.nextInt();
     Student studentArray[] = new Student[size];
     for(int i = 0;i<studentArray.length;i++)
     studentArray[i] = new Student();
     for(int i = 0;i<studentArray.length;i++)
     {
       System.out.println("Please Enter the student ID");
       studentArray[i].studentId = sc.nextInt();
       System.out.println("Please Enter the student Name");
       studentArray[i].studentName = sc.next();
       System.out.println("Please Enter the student Location");
       studentArray[i].studentLocation = sc.next(); 
       System.out.println("Please Enter Student CGPA");
       studentArray[i].studentCGPA = sc.nextFloat();      
     }
     ArrayList<Student> al = new ArrayList<>();      
     for(int i = 0;i<studentArray.length;i++)
     al.add(studentArray[i]);
     Collections.sort(al);
     System.out.println("The values are being showing in increasing order of Ids");
     for(Student obj1:al)
     System.out.println(obj1);
     Collections.sort(al,new StudentCGPAComparator());
     System.out.println("The values are displayed based on increasing order of CGPA");
     for(Student obj2:al)
     System.out.println(obj2);
     System.out.println("The values are displayed based on increasing order of Locations");
     for(Student obj3:al)
     System.out.println(obj3);
   }
}