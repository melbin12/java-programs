class Student{
 int studentid;
 String name;
 int m1,m2,m3;
 Student(){
	 studentid=100;
	 name="Ben";
	 m1=50;
	 m2=50;
	 m3=50;
 
 }
 Student(int i,String n,int n1,int n2,int n3){
	 studentid=i;
	 name=n;
	 m1=n1;
	 m2=n2;
	 m3=n3;
  }
Student(int n1,int n2,int n3){
	 studentid=102;
	 name="Diya";
	 m1=n1;
	 m2=n2;
	 m3=n3;
  }
  void display(){
	  System.out.println("Student Id:"+studentid);
	  System.out.println("Student Name:"+name);
      System.out.println("Mark1:"+m1);
	  System.out.println("Mark2:"+m2);
	  System.out.println("Mark3:"+m3);
  }	  
 void average(){
	 int total,avg;
	 total=m1+m2+m3;
	 System.out.println("  Total mark is:"+total);
	 avg=total/3;
	 System.out.println("  Average mark is:"+avg);
 }
  
}
 public class StudentDetails{
  public static void main(String args[]){
		Student s1=new Student();
		System.out.println("Details of Student 1:");
		s1.display();
		s1.average();
	    Student s2= new Student(101,"Cathy",45,45,45);
		System.out.println("Details of Student 2:");
		s2.display();
		s2.average();
	    Student s3= new Student(50,50,50);
		System.out.println("Details of Student 3:");
		s3.display();
		s3.average();
	}
}
		
		
	  