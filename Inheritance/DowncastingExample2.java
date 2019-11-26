class Parent
{
}
class Child extends Parent
{
  public static void main(String[] args)
  {
    Parent parent=new Child(); //upCasting
    Child child=(Child)parent; //downcasting.
    System.out.println("The Parent Class Object is being assigned to subClass and value is = "+child);
  }
}