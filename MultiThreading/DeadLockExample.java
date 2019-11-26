class DeadLockExample extends Thread
{
  private Thread thread;
  public DeadLockExample(){}
  public DeadLockExample(Thread thread)
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
     for(int i=0;i<3;i++)
     System.out.println(i);
    }catch(InterruptedException ie){System.out.println(ie);}
  }
  public static void main(String[] args)
  { 
    DeadLockExample d1=new DeadLockExample();
    DeadLockExample d2=new DeadLockExample(d1);
    d1.setThread(d2);
    d1.start();
    d2.start();
  }
}