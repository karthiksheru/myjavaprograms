class ThreadJoinFinalExample1 extends Thread
{
  public void run()  
  {
   try{
   for(int i=0;i<10;i++)
   {
     System.out.println("*&"+"\t");
     Thread.sleep(1000);
   }
   System.out.println("Thread-1 execution ended");
  }catch(InterruptedException ie){System.out.println(ie);}
  }
}