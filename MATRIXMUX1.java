import java.util.*;
import java.lang.*;

public class MATRIXMUX1
{
static Scanner s=new Scanner(System.in);	
 public static void main(String args[])
  {
	  int a,b,c,d;
	  int [][] A =new int[5][5];
          int [][] B =new int[5][5];
          int [][] C =new int[5][5];
	  
	  int Choice;
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the number of rows for matrix 1");
	  a=s.nextInt();
	  System.out.println("Enter the number of columns for matrix 2");
	  b=s.nextInt();
          System.out.println("Enter the number of rows for matrix 1");
	  c=s.nextInt();
	  System.out.println("Enter the number of columns for matrix 2");
	  d=s.nextInt();
	  while(true)
	  {
	  System.out.println("\n*********MENU*********");
	  System.out.println("1.Enter values into matrix \n");
	  System.out.println("2.Perform multiplication \n");
	  System.out.println("3.Display the resultant matrix \n");
	  System.out.println("4.Exit from the console \n");
          System.out.println("Enter the users choice \n");
	  Choice=s.nextInt();
	  switch(Choice)
	  {
		  case 1:inputdata(a,b,c,d,A,B);
		         break;
	      case 2:multiply(a,b,c,d,A,B,C);
		         break;
		  case 3:display(a,b,c,d,A,B,C);
		         break;
		  case 4:java.lang.System.exit(0);
		         break;
		  default:System.out.println("invalid choice");
	  }
  }
  }

 public static void inputdata(int a,int b,int c,int d,int [][] A,int [][] B)
  {
	  System.out.println("enter values into the matrix1");
	  for(int i=0;i<a;i++)
	  {
		  for(int j=0;j<b;j++)
		  {
			  A[i][j]=s.nextInt();
		  }	
	  }
      System.out.println("enter values into the matrix2");
	  for(int i=0;i<a;i++)
	  {
		  for(int j=0;j<b;j++)
		  {
			  B[i][j]=s.nextInt();
		  }
	  }
  }
 public static void multiply(int a,int b,int c,int d,int [][] A,int [][] B,int [][] C)
  {
    
   if(a==d)
    {
      for(int i=0;i<a;i++)
	{
		  for(int j=0;j<b;j++)
		  {
			  C[i][j]=0;
			  for(int k=0;k<b;k++)
		       {
			    C[i][j]+=A[i][k]*B[k][j];
		       }
		  }
	}
System.out.println("Multiplication Performed");
    }
   else
    {
       System.out.println("Multiplication cannot be performed");
    }
	   
  }	
public static void display(int a,int b,int c,int d,int [][] A,int [][] B,int [][] C)
 {
   System.out.println("displaying the resultant matrix");
    for(int i=0;i<a;i++)
	{
		 for(int j=0;j<b;j++)
		  {
		    System.out.print("\t"+C[i][j]);
		  }	
                 System.out.print("\n");
		  
	}
 }
}