package day1;
import java.util.Scanner;

public class nestedIf {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mark");
		int mark =sc.nextInt();
		if(mark>=35) {
			if(mark>=90) {
				System.out.println("Grade A:Excellent");
			}
			else if(mark>=60) {
				System.out.println("Grade B:Good");
				}
			else {
				System.out.println("Grade C:You can do Better!");
                }

		}
		else {
			System.out.println("Fail!");

		}
	}
}