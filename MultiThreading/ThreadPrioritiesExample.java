class ThreadPriorityExample extends Thread
{
  public void run()
  {
    System.out.println("The name of thread is = "+Thread.currentThread().getName());
    System.out.println("The priority of the thread is = "+Thread.currentThread().getPriority());
  }
  public static void main(String[] args)
  {
    ThreadPriorityExample m1=new ThreadPriorityExample();
    ThreadPriorityExample m2=new ThreadPriorityExample();
    System.out.println("The priorities of both the threads are "+m1.getPriority()+" and "+m2.getPriority()+" ");
    m1.setPriority(Thread.MIN_PRIORITY);
    m2.setPriority(Thread.MAX_PRIORITY);
    m1.setName("Thread-1");
    m2.setName("Thread-2");
    m1.start();
    m2.start();
  }
}