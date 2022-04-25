import java.util.*;
import java.lang.*;
public class Traversal
{
static Scanner s=new Scanner(System.in);	
 public static void main(String args[])
  {
	  int a;
	  int [] A =new int[5];
          int Choice;
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the number of elements");
	  a=s.nextInt();
          System.out.println("enter the data into matrix");
          inputdata(a,A);
          System.out.println("Array Traversed");
          traverse(a,A);
          
  }

 public static void inputdata(int a,int [] A)
  {
	 
	  for(int i=0;i<a;i++)
	  {
		  
	    A[i]=s.nextInt();
	  }
 
  }
 
public static void traverse(int a,int [] A)
 {
           
           for(int i=0;i<a;i++)
           {
           System.out.print("\t"+A[i]);
           }
 }
	  
}	  