class ThreadJoinFinalExample2 implements Runnable
{
  public void run()
  {
    for(int i=0;i<15;i++)
    System.out.println(i+"\t");
    System.out.println("Thread-2 Execution Ended");
  }
}