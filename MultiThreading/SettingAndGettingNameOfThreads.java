class A extends Thread
{
  public void run()
  {
   System.out.println("Thread is being executed Suceesfully");
  }
  public static void main(String[] args)
  {
    A a1=new A();
    A a2=new A();
    a1.start();
    a2.start();
    System.out.println("The Name of The Thread is = "+a1.getName());
    System.out.println("The Name of the Thread is = "+a2.getName());
    a2.setName("MyThread");
    System.out.println("The Name of the modified Thread is = "+a2.getName()); 
 }
}