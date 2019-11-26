class A extends Thread
{
 public void run()
 {
   try
   {
    for(char i='A';i<'Z';i++)
    {
      System.out.print(i+"\t");
    }
    Thread.sleep(3500);
    System.out.println("Thread is being exited"); 
  }catch(InterruptedException ie)
    {
     System.out.println(ie);
    }
 }
   public static void main(String[] args)
   {
     A a=new A();
     a.start();
     System.out.println("Main method started");
     System.out.println("Main Method Exited");
   } 
}