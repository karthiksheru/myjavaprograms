class SynchronisationExample extends Thread
{
  public synchronized void method1()
  {
     for(int i=0;i<10;i++)
     System.out.println(getName());
  }
  public void run()
  {
    method1();
  }
  public static void main(String[] args)
  {
     SynchronisationExample m1=new SynchronisationExample();
     SynchronisationExample m2=new SynchronisationExample();
     SynchronisationExample m3=new SynchronisationExample();
     m2.start();
     m1.start();
     m3.start();
  }
}