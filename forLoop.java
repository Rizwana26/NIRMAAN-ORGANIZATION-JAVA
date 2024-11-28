package day1;
import java.util.Scanner;

public class forLoop {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your table:");
		int table=sc.nextInt();
		
		for (int t=1;(t<=10);t++) {
			System.out.println(table+"x"+t+"="+table*t);

		}
		
	}

}
