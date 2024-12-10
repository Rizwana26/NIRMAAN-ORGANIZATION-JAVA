package day13;
import java.util.Scanner;

import day12.Book;
public class Main {
	public static void main(String[] args) {
		Employee emp=null;
		boolean isTrue=true;
		Scanner sc=new Scanner(System.in);
		while(true) {

		
		System.out.println("Enter the option");
		System.out.println("0 for add");
		System.out.println("1 for update");
		System.out.println("2 for show ");
		System.out.println("3 for exit ");
		System.out.println("Enter the option");

		int option=sc.nextInt();
		sc.nextLine();
		
			switch (option) {
			case 0: {
				
			 emp=new Employee("Ram", 1234, "Computer Science",9840620563l);
				break;
				}
			case 1:{
				System.out.println("Enter Employee Name");
				String name=sc.nextLine();
				emp.setEmpName(name);
				System.out.println("Enter empId:");
				int id=sc.nextInt();
				emp.setEmpId(id);
                sc.nextLine();
				System.out.println("Enter Department:");
				String department=sc.nextLine();
				emp.setDepartment(department);
				
				System.out.println("Enter Phone number:");
				long empPhoneNum=sc.nextLong();
				emp.setEmpPhoneNum(empPhoneNum);
				break;
			}
			case 2:{
				System.out.println(emp);
				break;
			}
			case 3:{
				isTrue=false;
				System.out.println("THank you");
				break;
				
			}
			default:
				System.out.println("Enter your Correct Choice!");
				
			}
			
			}
		}
	}


