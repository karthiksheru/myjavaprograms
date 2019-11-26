1. Predict the output?
class Parent
{
  Parent()
  {
    System.out.println("Parent class Constructor");
  }
  
}
class Child extends Parent
{
  Child(int x,int y)
  {
    System.out.println("Child class Constructor");
  }
  public static void main(String[] args)
  {
   Child child = new Child(10,20);
  }
}

Output-->Parent class Constructor
         Child class Constructor
 
Explanation-->When there are no parameters in Parent class Constructor 
and if there are any parameters in the child class Constructors.Then the
ParentClass constructor executes first later the child class Constructor
Executes.

2. 1. Predict the output?
class Parent
{
  Parent(int x,int y)
  {
    System.out.println("Parent class Constructor");
  }
  
}
class Child extends Parent
{
  Child(int x,int y)
  {
    System.out.println("Child class Constructor");
  }
  public static void main(String[] args)
  {
   Child child = new Child(10,20);
  }
}
 
Output-->Compile Time Error
When there is inheritance and if there is user defined constructor then 
U have to add default Constructor to get the output.

class Parent
{
  Parent(int x,int y)
  {
    System.out.println("Parent class Constructor");
  }
 Parent(){} 
}
class Child extends Parent
{
  Child(int x,int y)
  {
    System.out.println("Child class Constructor");
  }
  public static void main(String[] args)
  {
   Child child = new Child(10,20);
  }
}
 
And therefore now the output-->Child class Constructor

3. Predict the otput
class Parent
{
  Parent(int x)
  {
    System.out.println("Parent class Constructor");
  }
 Parent(){} 
}
class Child extends Parent
{
  Child(int x,int y)
  {
    System.out.println("Child class Constructor");
  }
  Child(int x,int y,int z)
  {
    System.out.println("No Work");
    this(x,y);
  }
  public static void main(String[] args)
  {
   Child child = new Child(10,20,20);
  }
}

Output--> Compilation Error
The Error is sbecause this() should be the first executable 
statement in constructor.

4.Predict the following.
import java.util.Scanner;
class A
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Please Enter the value of x");
   char ch = 1;
   switch(ch)
   {
     case '1' : System.out.println("C");
     case '2' : System.out.println("DS");
     default : System.out.println("Java");
   }
   System.out.println("Python");
 }
}
 
Output-->We think that 1 is not a character but ch accepts 1
and the value of 1 is 49 and the output is-->Java
                                             Python

5. Predict the following.
class A
{
 A()
 {
   System.out.println("This is A class Constructor");
 }
 static
 {
   System.out.println("This is Static Block");
 }
 public void method1()
 {
   System.out.println("This is method");
 }
 public static void main(String[] args)
 {
   System.out.println("Main Method starts");
   A a = new A();
   {
     System.out.println("This is non static block");
     A a1 = new A();
   }
   a.method1();
   System.out.println("Main Method Ends");
 }
}

Answer-->The static block gets executed only once and gets executed 
         first.
         The static block gets executed before the execution of first 
         method.
         If there are multiple static blocks then firstn static block gets 
         executed... and so on..
Output-->
This is Static Block
Main Method starts
This is A class Constructor
This is non static block
This is A class Constructor
This is method
Main Method Ends

6.Predict The output
class A
{
  static int x;
  int y;
  public void incrementValue()
  {
   x++;
   y++;
  }
  public void displayValue()
  {
    System.out.println("The value of static variable is = "+x);
    System.out.println("The value of non static variable is = "+y);
  }
  public static void main(String[] args)
  {
     A a1 = new A(); 
     a1.incrementValue();
     a1.incrementValue();
     a1.incrementValue();
     a1.incrementValue(); 
     a1.displayValue();
     A a2 =new A();
     a2.displayValue();
  }
}

Output-->
The value of static variable is = 4
The value of non static variable is = 4
The value of static variable is = 4
The value of non static variable is = 0

7. Predict the output?
import java.io.IOException;
class A
{
  public static void start() throws IOException, ArithmeticException
  {
    throw new ArithmeticException("Not able to start");
  }
  public static void main(String[] args) 
  {
     try
     {
       start();
     }
     catch(Exception re)
     {
      re.printStackTrace();
     }
     catch(ArithmeticException e)
     {
       e.printStackTrace();
     }
  }
}

Output==>Compile Time Error
The parent Excetion is declared below the childException
ie The (Exception re) should be below and that (ArithmeticException e)should be above.
 
The correct syntax is = >
import java.io.IOException;
class A
{
  public static void start() throws IOException, ArithmeticException
  {
    throw new ArithmeticException("Not able to start");
  }
  public static void main(String[] args) 
  {
     try
     {
       start();
     }
     catch(ArithmeticException re)
     {
      re.printStackTrace();
     }
     catch(Exception re)
     {
      re.printStackTrace();
     }
  }
}

8.Predict the output?

import java.io.IOException;
class A
{
  public static void start()
  {
    System.out.println("This is For Checking Purpose");
  }
  public static void main(String[] args) 
  {
     try
     {
       start();
     }
     catch(IOException re)
     {
      re.printStackTrace();
     }
  }
}

Output--> Compile Time Error
Because the try block is not throwing IOException but your 
catching IOException which is a UseLess Thing.
In the catch you can catch any runtime time Exception to get the 
desired Output.

9. Predict the output?

import java.io.IOException;
class A
{
  public static void start() throws IOException
  {
    System.out.println("This is For Checking Purpose");
  }
  public static void main(String[] args) 
  {
     try
     {
       start();
     }
     catch(IOException re)
     {
      re.printStackTrace();
     }
  }
}

Output-->
This is For Checking Purpose

10. Predict the output?

import java.io.IOException;
class A
{
  public static void start()
  {
    System.out.println("This is For Checking Purpose");
  }
  public static void main(String[] args) 
  {
     try
     {
       start();
       System.exit(1);
     }
     finally
     {
      System.out.println("This is finally Block"); 
     }
  }
}

Answer--> This is For Checking Purpose
The finally block does not execute because System.exit means termination of
program.
System.exit(0)--> Means Successful Termination.
System.exit(1)--> Means Unsuccessful Termintion.

11. Predict the Following

class A
{
  public static String method()
  {
    try
    {
     int x = 10/0;
    }catch(ArithmeticException ie)
     { 
       return "first";
     } 
    finally
    {
      return "Last";
    }
  }
  public static void main(String[] args)
  {
   System.out.println("The value is = "+method());
  }
}

Answer:- it goes to catch and from there it goes to finally because
         it has to return only one value.
O/p- Last

12. Predict the output

class A
{
  public static void method()
  {
    try
    {
     int x = 10/0;
    }catch(ArithmeticException ie)
     { 
      System.out.println("First");
     } 
    finally
    {
     System.out.println("Last");
    }
  }
  public static void main(String[] args)
  {
   method();
  }
}
 
outut-->First
        Last

12. Predit the following

class A
{
  public static void main(String [] args)
  {
    method1();
    System.out.println("Hello"); 
  }
  public  static void method1()
  {
    method2();
  }
  public static void method2()
  {
   method3();
  }
  public static void method3()
  {
   throw new ArithmeticException();
  }
}
output-->Throws java.lang.ArithmeticException

13.PRedict
 
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.io.IOException;
class SuperClass
{
  public void method() throws IOException  
  {
    System.out.println("This is super class method");
  }
}
class SubClass extends SuperClass FileNotFoundException 
{
  public void method() throws 
  {
    System.out.println("This is SubClass Method");
  }
  public static void main(String[] args)
  {
   SuperClass sup = new SubClass();
   try
   {
    sup.method();
   }catch(Exception e){e.printStackTrace();}
   }
}

Output-->This is SubClass Method

14. Predict

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.io.IOException;
class SuperClass
{
  public void method() throws FileNotFoundException 
  {
    System.out.println("This is super class method");
  }
}
class SubClass extends SuperClass 
{
  public void method() throws IOException  
  {
    System.out.println("This is SubClass Method");
  }
  public static void main(String[] args)
  {
   SuperClass sup = new SubClass();
   try
   {
    sup.method();
   }catch(Exception e){e.printStackTrace();}
   }
}

Ans-->.java:13: error: method() in SubClass cannot override method() in SuperClass
  public void method() throws IOException
              ^
  overridden method does not throw IOException


15.Predict
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.io.IOException;
class SuperClass
{
  public void method() throws NullPointerException
  {
    System.out.println("This is super class method");
  }
}
class SubClass extends SuperClass 
{
  public void method() throws Exception  
  {
    System.out.println("This is SubClass Method");
  }
  public static void main(String[] args)
  {
   SuperClass sup = new SubClass();
   try
   {
    sup.method();
   }catch(Exception e){e.printStackTrace();}
   }
}

Output-->Compile time Error
Because the parent class Exception must throw parent Exception
Golden Rule-->Parent Exceptions must be in the parent class.