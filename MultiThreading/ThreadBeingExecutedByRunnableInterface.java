class A implements Runnable
{
  public void run()
  { 
    System.out.println("This Thread is being executed by implementing Runnable Interface");
  }
  public static void main(String[] args) 
  {
     A a=new A();
     Thread t1=new Thread(a);
      t1.start(); 
  }
}