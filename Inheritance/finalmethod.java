class A
{
   final void m1()
   {
     System.out.println("Hello");
   }
}
class B extends A
{
   void m1()
   {
     System.out.println("Hii");
   }
   public static void main(String[] args)
   {
     A a=new A();
     a.m1(); 
   }
}
