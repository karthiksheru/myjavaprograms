import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
class ArrayToArrayListObjectExample2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter the size of the array"); 
    int size = sc.nextInt();
    String array[] = new String[size];
    for(int i = 0;i<array.length;i++)
    array[i]=sc.next();
    List<String> arrayList=Arrays.asList(array);
    for(int i = 0;i<arrayList.size();i++)
    System.out.println(arrayList.get(i));
  }
}