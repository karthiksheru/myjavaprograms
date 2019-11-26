import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collection;
class StudentMapImplementation
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter How many StudentDetails You Want to enter");
    int size=sc.nextInt();
    StudentMapExample studentArray[] = new StudentMapExample[size];
    for(int i = 0;i<studentArray.length;i++)
    studentArray[i] =  new StudentMapExample();
    for(int i = 0;i<studentArray.length;i++)
    { 
      System.out.println("Please Enter Student Id");
      studentArray[i].studentId = sc.nextInt();
      System.out.println("Please Enter Student Name");
      studentArray[i].studentName = sc.next();
      System.out.println("Please Enter Student Age");
      studentArray[i].studentAge = sc.nextInt(); 
   }
   HashMap map = new HashMap();
   for(int i = 0;i<studentArray.length;i++)
   {
      map.put(studentArray[i].getStudentId(),studentArray[i]);
   }
   System.out.println(map);
   System.out.println("Enter the id Number of the student whose details u want to know");
   int keyNumber = sc.nextInt(); 
   System.out.println("The details of StudentId "+keyNumber+" is = "+map.get(keyNumber)); 
   Set KeySet = map.keySet();
   System.out.println(KeySet.toString());
   System.out.println("The Student Details are =  retrieved using keySet()");
   for(Object keys:KeySet)
   System.out.println(map.get(keys)); 
   System.out.println("The Student Details are = retrieved using EntrySet()");
   Set entries = map.entrySet();
   System.out.println(entries.toString());
   for(Object enter : entries)
   {
      Entry entry =(Entry)enter;
      System.out.println(entry.getKey()+" "+entry.getValue()); 
   }
   System.out.println("To get only values u can also use the Values method of map class which returns collection refernce");
   Collection values = map.values();
   for(Object o : values) 
   System.out.println(o);
 }
}