package day7;
import java.util.Scanner;

public class Substring {
	public static void main(String args[]) {
		//Using length()
//	 String name="Rizwana";
//		int lengthOfString=name.length();
//		System.out.println(lengthOfString);
		
		//Using substring()
//		String  name="Rizwana";
//    	 String subString=name.substring(0, 7);
// 		 System.out.println(subString);
		
		//Using scanner&substring& char
		
      Scanner sc=new Scanner(System.in);
       System.out.println("enter your name:");
        String name=sc.nextLine();
        System.out.println(name.substring(0, 4));
     
   //   System.out.println(name.charAt(2));
		
	}

}
