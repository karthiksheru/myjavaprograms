class MainDummy extends Thread
{
  public static void main(String[] args)
  {
     DummyThreadExample dte1=new DummyThreadExample();
     DummyThreadExample dte2=new DummyThreadExample();
     DummyThreadExample dte3=new DummyThreadExample(dte2);
     dte1.start();
     dte3.start();
     dte2.start();            
  }
}