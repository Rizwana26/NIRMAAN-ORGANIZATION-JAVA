package day7;

public class Student {
	String name="";
	int age=0;
	String dob="";
	int rollno=0;
	
	public static void main(String args[]) {
		Student student1=new Student();
		student1.name="Rizwana";
		student1.age=20;
		student1.dob="20/04/2004";
		student1.rollno=12;
		
		
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.dob);
		System.out.println(student1.rollno);

		Student student2=new Student();
		student2.name="Ribbana";
		student2.age=22;
		student2.dob="23/05/2002";
		student2.rollno=12;
		
		
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.dob);
		System.out.println(student2.rollno);
	}

}
