class ThreadJoinExample1 extends Thread
{
  public void run()
  {
    try
    {
      for(int i=0;i<25;i++)
      {
        System.out.print(i+"\t");
        Thread.sleep(2000);
      }
     System.out.println("first Thread Completely Executed");
    } 
     catch(InterruptedException ie) 
     {
      System.out.println(ie);
     }
  }
}