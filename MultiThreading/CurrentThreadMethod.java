class A extends Thread
{
  public void Run()
  {
    System.out.println("Running");
  }
  public static void main(String[] args)
  {
    A thread1=new A();
    thread1.start(); 
    System.out.println("The Name of Current Thread = "+Thread.currentThread().getName());
    Thread.currentThread().setName("Current Thread");
    System.out.println("The Name of the  modified thread = "+Thread.currentThread().getName());
  }
}