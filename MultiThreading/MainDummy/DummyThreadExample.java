class DummyThreadExample extends Thread
{
  private Thread thread;
  public DummyThreadExample()
  {
  }
  public DummyThreadExample(Thread thread)
  {
    this.thread=thread;
  }
  public void run()
  {
    if(thread!=null)
    {
      try
      {
        thread.join(); 
        Thread.sleep(5000);
      }catch(InterruptedException ie)
       {
         System.out.println(ie);
       }
    }
    for(int i=0;i<10;i++)
    {
      System.out.println(getName());
    } 
  }
}