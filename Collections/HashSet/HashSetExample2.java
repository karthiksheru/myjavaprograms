import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2
{
	public static void showSet()
	{
		//HashSet does not follow insertion order and output is not predictable
		//where there is no need of sorting we are not bothered about sorting we use HashSet
		//HashSet allows null values but it displays the null value first
		//null values cannot be duplicated
		
		HashSet<String> s1=new HashSet<>();
		s1.add("Hi");
		s1.add("Hello");
		s1.add(null);
		s1.add("How");
		s1.add("are");
		s1.add(null);
		System.out.println(s1);
		
		//Set is also part of collections so iterator can also be used
		
		Iterator<String> it=s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	public static void main(String[] args)
	{
		
		showSet();
	}

}
