class A
{
  void addition(double x,double y) //longer datatype
  { 
    double z;
    z=x+y;
    System.out.println("The addition of given numbers is = "+z);
  }
 public static void main(String[] args)
 { 
     A a=new A();
     a.addition(9.23f,12.31f);   
 }
}