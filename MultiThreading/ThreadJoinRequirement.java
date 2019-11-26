//After thread1-->thread3-->thread2
class ThreadJoinRequirement extends Thread
{
  private Thread thread;
  public ThreadJoinRequirement()
  {
  }
  public ThreadJoinRequirement(Thread thread)
  {
    this.thread=thread;
  }
  public void setThread(Thread thread)
  {
    this.thread=thread;
  }
  public void run()
  {
    try
    {
      if(thread!=null)
      thread.join();
      for(int i=0;i<5;i++)
      {
        Thread.sleep(1800);
        System.out.println(getName());
      } 
   }catch(Exception a)
     {
       System.out.println(a);
     }
  }
  public static void main(String[] args)
  {
    ThreadJoinRequirement m1=new ThreadJoinRequirement();
    ThreadJoinRequirement m2=new ThreadJoinRequirement();
    ThreadJoinRequirement m3=new ThreadJoinRequirement(m1);
    m2.setThread(m3);
    m1.start();
    m2.start();
    m3.start();
  }
}