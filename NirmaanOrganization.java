package RIZ;

import java.util.Scanner;

public class NirmaanOrganization {
	  String name="";
	  int id=0;
	  int salary=0;
	  String subject="";
	  
	  void checkin() {
		  System.out.println("Employee here");
	  }
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		NirmaanOrganization emp1=new NirmaanOrganization();
		System.out.println("enter your name:");

		emp1.name = sc.nextLine();
		System.out.println("enter your id:");

		emp1.id=sc.nextInt();
		System.out.println("enter your salary");

		emp1.salary=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter your subject:");
        emp1.subject=sc.nextLine();
		
		
		
		System.out.println(emp1.name);
		System.out.println(emp1.id);
		System.out.println(emp1.salary);
		System.out.println(emp1.subject);
		emp1.checkin();

		
		
		
	}

}
