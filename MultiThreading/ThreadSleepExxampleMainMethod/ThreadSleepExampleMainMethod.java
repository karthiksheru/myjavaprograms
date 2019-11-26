class ThreadSleepExampleMainMethod extends Thread
{
  public static void main(String[] args)
  {
    ThreadSleepExample3 tse3=new ThreadSleepExample3();
    ThreadSleepExample4 tse4=new ThreadSleepExample4();
    ThreadSleepExample5 tsee5=new ThreadSleepExample5();
    Thread tse5=new Thread(tsee5); 
    tse3.start();
    tse4.start();
    tse5.start();
  }
}