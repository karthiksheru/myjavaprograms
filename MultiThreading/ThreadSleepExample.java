class A extends Thread
{
  public void run()
  {
    try
    {
      for(int i=0;i<25;i++)
      {
        System.out.print(i+"\t");
      }
      Thread.sleep(4500);
      System.out.println("The Thread is exited");
    }
    catch(InterruptedException ie)
    {
      System.out.println(ie);
    }
  }
  public static void main(String[] args)
  {
    A a=new A();
    a.start();
    System.out.println("Main Method started");
    System.out.println("Main Method Ended");
  }
}