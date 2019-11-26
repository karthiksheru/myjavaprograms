class WrapperToPrimitive
{
  public static void main(String[] args)
  {
    Integer a=new Integer(3.25f);
    int j=a.intValue();
    System.out.println(j);
  }
}