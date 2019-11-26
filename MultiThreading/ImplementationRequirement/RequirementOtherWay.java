class RequirementOtherWay extends Thread
{
  public void run()
  {
    for(int i=0;i<6;i++)
     System.out.println(getName()+"\t");
  }
  public static void main(String[] args)
  {
    try
    {
     RequirementOtherWay r1=new RequirementOtherWay();
     RequirementOtherWay r2=new RequirementOtherWay();
     RequirementOtherWay r3=new RequirementOtherWay();
     RequirementOtherWay r4=new RequirementOtherWay();
     RequirementOtherWay r5=new RequirementOtherWay();
     r1.start();
     r2.start();
     Thread.sleep(5000);
     r3.start();
     r3.join();
     r4.start();
     r5.start();
  }catch(InterruptedException ie)
     {
       System.out.println(ie);
     }
  }
}