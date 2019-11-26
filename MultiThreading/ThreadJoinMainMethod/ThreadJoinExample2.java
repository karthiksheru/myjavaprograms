class ThreadJoinExample2 extends Thread
{
  public void run()
  {
    for(char i='A';i<'Z';i++)
    System.out.print(i+"\t");
    System.out.println("Second Thread Completely Executed");
  }
}