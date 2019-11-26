class ThreadJoinMainMethod extends Thread
{
  public static void main(String[] args)
  {
    try
    {
     ThreadJoinExample1 thread1=new ThreadJoinExample1();
     ThreadJoinExample2 thread2=new ThreadJoinExample2();
     thread1.start();
     thread1.join();
     thread2.start();
    }catch(Exception e)
     {
        System.out.println(e);
     }
  }
}