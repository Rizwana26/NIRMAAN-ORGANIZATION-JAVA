package day12;
import java.util.Scanner;
public class SingleBookManagement {
	public static void main(String[] args) {
		Book book=null;
		boolean istrue=true;

	while(istrue=true) {
		System.out.println("0 for exit");
		System.out.println("1 for add");
		System.out.println("2 for update");
		System.out.println("3 for show");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option");
		int option=sc.nextInt();
		sc.nextLine();


		
		switch (option) {
		case 1: {
			
		 book=new Book("opps", "ravi", 250.5, 4);
			break;
			}
		case 2:{
			System.out.println("Enter Title");
			String title=sc.nextLine();
			book.setTitle(title);
			System.out.println("Enter author");
			String author=sc.nextLine();
			book.setAuthor(author);

			System.out.println("Enter price");
			double price=sc.nextDouble();
			book.setPrice(price);
			System.out.println("Enter numofcopies");
			int numOfCopies=sc.nextInt();
			book.setNumberOfCopies(numOfCopies);
			break;
		}
		case 3:{
			System.out.println(book);
			break;
			
		}
		case 0:{
			istrue=false;
			System.out.println("thank you");
			break;
		}
		default:
			System.out.println("Enter your Correct Choice!");
		}
		
	}
		                              

	}

}
