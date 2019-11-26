import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

class InputStreamReaderExample
{
  public static void main(String[] args)
  {
    try
    {
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
     System.out.println("Please Enter how many student Details you want to enter");
     int size =Integer.parseInt(br.readLine());
     Student studentArray[] = new Student[size];
     
     for(int i = 0;i<studentArray.length;i++)
     	studentArray[i]= new Student();
     

     for(int i = 0; i < studentArray.length; i++)
     {
        System.out.println("Please Enter Student Id");
        studentArray[i].studentId = Integer.parseInt(br.readLine());
        System.out.println("Please Enter student Section");
        studentArray[i].studentSection = (char)br.read();
        System.out.println("Please Enter student Name");
        br.readLine();
        studentArray[i].studentName = br.readLine();
        System.out.println("Please Enter student Location");
        studentArray[i].studentLocation = br.readLine(); 
        System.out.println("Please Enter Student CGPA");
        studentArray[i].studentCGPA =Float.parseFloat(br.readLine());
     }
     
     ArrayList<Student> al = new ArrayList<>();
     
     for(int i = 0;i<studentArray.length;i++)
     	al.add(studentArray[i]);
    
    
     Collections.sort(al);
     

     for(Student student:al)
     	System.out.println(student);


     FileWriter writer = new FileWriter("demo.txt");
      

      for(int index =0; index < studentArray.length; index++){
     	 writer.write(studentArray[index].studentId+" ");
         writer.write("\n");
         writer.write(studentArray[index].studentName);
         writer.write("\n");
         writer.write(studentArray[index].studentLocation);
         writer.write("\n");
         writer.write(studentArray[index].studentCGPA+" ");
         writer.write("\n");
         writer.flush();
      }





    }catch(IOException ie){System.out.println(ie);}  
  }
}