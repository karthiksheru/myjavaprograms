import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class ArrayListAddAllExample
{
  public static void main(String[] args)
  {
    List<String> friends = Arrays.asList("Karthik","Singh","Kumar");
    List<String> enemies = Arrays.asList("Raju","Rohan","Ravi");
    ArrayList friendsNames = new ArrayList<>(friends);
    ArrayList<String> enemiesNames = new ArrayList<>(enemies);
    friendsNames.add(enemiesNames);
    System.out.println(friendsNames);
    friendsNames.addAll(enemiesNames);
    System.out.println(friendsNames);
  }
}