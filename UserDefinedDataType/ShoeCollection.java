import java.util.Scanner;
class ShoeCollection
{
  Shoe shoeArray[];
  public ShoeCollection()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Select How many pair of shoes you want");
    int size=sc.nextInt();
    shoeArray=new Shoe[size];
    for(int i=0;i<shoeArray.length;i++)
    shoeArray[i]=new Shoe();  
    for(int i=0;i<shoeArray.length;i++)
    {
      sc.nextLine();
      System.out.println("Please Enter the shoe Company");
      shoeArray[i].shoeCompany = sc.nextLine();
      System.out.println("Please Enter the shoe Size"); 
      shoeArray[i].shoeNumber = sc.nextInt();
      System.out.println("Please Enter the shoe Price Upto which you want");
      shoeArray[i].shoePrice = sc.nextFloat();
   }
    for(int i=0;i<shoeArray.length;i++)
    {
      int j=i+1;
      System.out.println("The Shoes Pairs You want are");
      shoeArray[i].showDetails();
    }   
  }
  public static void main(String[] args)
  {
    ShoeCollection st=new ShoeCollection(); 
  }
}