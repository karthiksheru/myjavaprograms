class ThreadPriorityFinalExample extends Thread
{
  public void run()
  {
    System.out.println("The name of the thread is = "+Thread.currentThread().getName());
    System.out.println("The priority of the thread is = "+Thread.currentThread().getPriority());
    System.out.println("Is The Thread is Daemon Thread = "+Thread.currentThread().isDaemon());
  }
  public static void main(String[] args)
  {
    ThreadPriorityFinalExample m1=new ThreadPriorityFinalExample(); 
    ThreadPriorityFinalExample m2=new ThreadPriorityFinalExample();
    m1.setName("Thread-1");
    m2.setName("Thread-2");
    m1.setPriority(Thread.MIN_PRIORITY);
    m2.setPriority(Thread.MAX_PRIORITY);
    m1.start();
    m2.start(); 
  }
}