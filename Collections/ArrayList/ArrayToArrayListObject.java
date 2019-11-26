import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
class ArrayToArrayListObject
{
  public static void conversion()
  {
    Scanner sc=new Scanner(System.in);
    String array[]=new String[5];
    for(int i = 0;i<array.length;i++)
    {
      array[i]=sc.next();
    }
    Integer[] nums = {2,4,5,6,7};
    List<Integer> numsList = Arrays.asList(nums);
    List<String> arrayList = Arrays.asList(array);
    ListIterator li = arrayList.listIterator();
    while(li.hasNext())
    {
     System.out.println(li.next());
    } 
 }
  public static void main(String[] args)
  {
      conversion();
  }
}