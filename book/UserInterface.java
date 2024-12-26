package book;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
	public static void main(String[] args) {
		boolean isTrue=true;
		Book book=new Book();
		ArrayList<Book> al=new ArrayList<Book>();
		while(isTrue) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice:");
			System.out.println("0 for exit :");
			System.out.println("1 for add:");
			System.out.println("2 for update:");
			System.out.println("3 for show:");
			int choice=sc.nextInt();
            sc.nextLine();
			
			if(choice==1) {
				 System.out.println("Enter your book name:");
				 String bookname=sc.nextLine();
				
				 System.out.println("Enter Number of Copies:");
				 int numOfCopies=sc.nextInt();
				 System.out.println("Enter Book Price:");
				 double price=sc.nextDouble();
		         al.add(book=new Book(bookname, numOfCopies, price));

			}
			else if(choice==2) {
				 System.out.println("Enter your book name:");
				  String bookname=sc.nextLine();
				 
				  for(Book book1:al) {
					  if(bookname.equalsIgnoreCase(book1.getName()));
					  System.out.println("Rename your book:");
					  String rename=sc.nextLine();
			             book.setName(rename);

					  }
	             
	             
	             System.out.println("Enter Number of Copies:");
				 int numOfCopies=sc.nextInt();
				 book.setNumOfCopies(numOfCopies);
				 
				 System.out.println("Enter Book Price:");
				 double price=sc.nextDouble();
				 book.setPrice(price);
				
				
			}
			else if(choice==3) {
				System.out.println(al);
			}
			else if(choice==4) {
				System.out.println("Thank you");
			}
			else {
				
				isTrue=false;
				System.out.println("Enter Correct Choice!");
			}
			
		}
		
		


		
		
	}

}
