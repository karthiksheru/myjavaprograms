class ThreadJoinFinalMainMethod extends Thread
{
  public static void main(String[] args)
  {
    try
    {
     ThreadJoinFinalExample1 thread1=new ThreadJoinFinalExample1();
     ThreadJoinFinalExample2 thred2=new ThreadJoinFinalExample2();
     thread1.start();
     thread1.join();
     Thread thread2=new Thread(thred2);
     thread2.start();
     System.out.println("The name of first thread is = "+thread1.getName());
     System.out.println("The name of second thread is = "+thread2.getName());
     thread1.setName("Thread1 Using Join Method ");
     thread2.setName("Thread2 not using Join Method");
     System.out.println("The name of  modified first thread is = "+thread1.getName());
     System.out.println("The name of modified second thread is = "+thread2.getName());  
    }catch(InterruptedException ie)
     {
       System.out.println(ie);
     } 
 }
}