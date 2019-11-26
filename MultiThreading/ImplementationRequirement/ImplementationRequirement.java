class ImplementationRequirement extends Thread
{
  public static void main(String[] args)
  {
    Requirement r1=new Requirement();
    Requirement r2=new Requirement();
    Requirement r3=new Requirement(r2);
    Requirement r4=new Requirement();
    Requirement r5=new Requirement();
    r1.start();
    r2.start();
    r3.start();
    r4.start();
    r5.start();
  }
}