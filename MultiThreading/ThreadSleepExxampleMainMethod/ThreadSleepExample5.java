class ThreadSleepExample5 implements Runnable
{
  public void run()
  {
     try
     {
      for(int i=0;i<25;i++)
      {
        System.out.print("#*"+"\t");
        Thread.sleep(2000);
      }
      System.out.println("This is thread sleep method of ThreadSleepExample5");
     }catch(InterruptedException ie)
      {
        System.out.println(ie);
      }
  }
}