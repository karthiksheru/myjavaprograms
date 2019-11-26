class A extends Thread
{
  public void run()
  {
     System.out.println("This Thread is being executed by Threas class");
  }
  public static void main(String[] args)
  {
     A a1=new A();
     A a2=new A();
     a1.start();
     a2.start();
    System.out.println("Main Method Started");
    System.out.println("Main Method Ended");
  }
}