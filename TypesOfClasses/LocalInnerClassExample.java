class LocalInnerClassExample
{
  public static void method()
  {
     class LocalInnerExample
     {
        public void LocalInnerMethod()
        {
         System.out.println("This is Inner method of local Inner class");
        }
      }
   LocalInnerExample lie = new  LocalInnerExample();
   lie.LocalInnerMethod();
  }
  public static void main(String[] args)
  {
    method(); 
  }
}