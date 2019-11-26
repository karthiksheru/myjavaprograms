import java.util.Scanner;
class StringExample
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Please Enter First Value");
    String  str1 = sc.nextLine();
    System.out.println("The Number of characters present in the String are = "+str1.length());
    String initCapital = str1.substring(0,1).toUpperCase()+str1.substring(1);
    System.out.println("The FirstLetterCapital is = "+initCapital);
    //To Remove FrontSpace and End Space we use trim() method.
    
    System.out.println("Please Enter Second Value");
    String str2 = sc.nextLine();
    
   //String objects are immutable and you cant store the modified value in the same variable. 
    
    String modifiedValue = str1.concat(" "+str2);
    System.out.println("The Concatenated Value is  = "+modifiedValue);  
    if(str1.equals(str2))
    System.out.println("Both the strings are equal");
  
// we can also compare two Strings using == but this compares based on which instance they are created.    

    if(str1.equalsIgnoreCase(str2))
    System.out.println("Their cases might be different but both are of same value");  
    
    byte byteArray[] = str1.getBytes();
    System.out.println("The Length of the array = "+byteArray.length);
    String str[] = modifiedValue.split(" ");
    int words=0;
    for(String obj:str)
    words++;
    System.out.println("The Total Number Of words = "+words);
  }
}