class ThreadSleepExample3 extends Thread
{
  public void run()
  {
     try
     {
       for(char i='a';i<'z';i++)
       {
        System.out.print(i+"\t");
         Thread.sleep(3000);
       } System.out.println("This is Thread of ThreadSleepExample3");
     }
     catch(InterruptedException ie)
     {
       System.out.println(ie);
     }
   }
}