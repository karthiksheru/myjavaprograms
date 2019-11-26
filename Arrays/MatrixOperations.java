import java.util.Scanner;
class A
{
  public void addition()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter the row size of the array");
    int row=sc.nextInt();
    System.out.println("Please Enter the col size of the array");
    int col=sc.nextInt();
    int x[][]=new int[row][col];
    int y[][]=new int[row][col];
    int z[][]=new int[row][col];
    System.out.println("Please enter the elements of the first array"); 
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)       
     {
       x[i][j]=sc.nextInt();    
     }
    }
    System.out.println("Please enter the elements of the second array"); 
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     { 
      y[i][j]=sc.nextInt();
     }
    }
    System.out.println("The elements of First Array are");
    System.out.println();
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)       
     {
       System.out.print(x[i][j]+" ");    
     }
     System.out.println();
    }
    System.out.println("The elements of Second Array are");
    System.out.println();
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)       
     {
       System.out.print(y[i][j]+" ");    
     }
     System.out.println();
    }
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     {
       z[i][j]=x[i][j]+y[i][j];
     }
    }
   System.out.println("The resulted additon of array is");
   System.out.println();
   for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     {
       System.out.print(z[i][j]+" ");
     }
     System.out.println();
    }
   
  }
  public void subtraction()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter the row size of the array");
    int row=sc.nextInt();
    System.out.println("Please Enter the col size of the array");
    int col=sc.nextInt();
    int x[][]=new int[row][col];
    int y[][]=new int[row][col];
    int z[][]=new int[row][col];
    System.out.println("Please enter the elements of the first array"); 
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)       
     {
       x[i][j]=sc.nextInt();    
     }
    }
    System.out.println("Please enter the elements of the second array"); 
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     { 
      y[i][j]=sc.nextInt();
     }
    }
    System.out.println("The elements of First Array are");
    System.out.println();
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)       
     {
       System.out.print(x[i][j]+" ");    
     }
     System.out.println();
    }
    System.out.println("The elements of Second Array are");
    System.out.println();
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)       
     {
       System.out.print(y[i][j]+" ");    
     }
     System.out.println();
    }
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     {
       z[i][j]=x[i][j]-y[i][j];
     }
    }
   System.out.println("The resulted subtraction of array is");
   System.out.println();
   for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     {
       System.out.print(z[i][j]+" ");
     }
     System.out.println();
    }
   
  }
  public void mutliplication()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter the row size of the array");
    int row=sc.nextInt();
    System.out.println("Please Enter the col size of the array");
    int col=sc.nextInt();
    int x[][]=new int[row][col];
    int y[][]=new int[row][col];
    int z[][]=new int[row][col];
    System.out.println("Please enter the elements of the first array"); 
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)       
     {
       x[i][j]=sc.nextInt();    
     }
    }
    System.out.println("Please enter the elements of the second array"); 
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     { 
      y[i][j]=sc.nextInt();
     }
    }
    System.out.println("The elements of First Array are");
    System.out.println();
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)       
     {
       System.out.print(x[i][j]+" ");    
     }
     System.out.println();
    }
    System.out.println("The elements of Second Array are");
    System.out.println();
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)       
     {
       System.out.print(y[i][j]+" ");    
     }
     System.out.println();
    }
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     {
       z[i][j]=0;
       for(int k=0;k<row;k++)
       {  
         z[i][j]=z[i][j]+x[i][k]*y[k][j];
       }
     }
    }
   System.out.println("The resulted subtraction of array is");
   System.out.println();
   for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     {
       System.out.print(z[i][j]+" ");
     }
     System.out.println();
    }
   
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    A a=new A();
    System.out.println("Please Enter ur Choice + or - or * ");
    int choice=sc.next().charAt(0);
    switch(choice)
    {
      case '+':a.addition();
               break;
      case '-':a.subtraction();
               break;
      case '*':a.mutliplication();
               break;
      default:System.out.println("Please Select a valid option");
              break;
    }
  }
}
