import java.util.Scanner;
class A
{
  public void addition(int x,int y)
  {
     int result=x+y;
     System.out.println("The addition of two Numbers is = "+result);
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    int x=(int)a;
    int y=(int)b;
    A q=new A();
    q.addition(x,y);    
  } 
}