//Requirement-->Out of threads the third thread should be executed after the execution of all threads.
class Requirement extends Thread
{
  private Thread thread;
  public Requirement()
  {
  }
  public Requirement(Thread thread)
  {
    this.thread=thread;
  }
  public void run()
  {
    try
    {
      if(thread!=null)
      {
        Thread.sleep(5000);
        System.out.println("The Thread Name for == "+thread.getName());        
        thread.join();
      } 
      for(int i=0;i<5;i++) 
      System.out.println(getName()+"\t");
    }
    catch(InterruptedException ie)
    {
      System.out.println(ie);
    }
  }
}