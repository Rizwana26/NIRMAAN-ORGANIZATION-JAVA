package day1;
import java.util.Scanner;

public class IfStatement {
	public static void main(String args[])
	{
     Scanner sc =new Scanner (System.in);
     System.out.println("0 for add:");
     System.out.println("1 for sub:");
     System.out.println("2 for multiplicaton:");
     System.out.println("3 for division :");
     System.out.println("4 for modulus :");
      int key =sc. nextInt();
      System.out.println("enter your first number");
      int firstNum=sc.nextInt();
      System.out.println("enter your second  number");
      int secondNum=sc.nextInt();
    /*  if (key==0) {
          int total=firstNum+secondNum;
          System.out.println("Addition:"+total);
          }
      else if(key==1) {
    	  int total=firstNum-secondNum;
          System.out.println("subraction:"+total);
    	  }
      else if(key==2) {
    	  int total=firstNum*secondNum;
          System.out.println("multiplication:"+total);
    	  }
      else if(key==3) {
    	  int total=firstNum/secondNum;
          System.out.println("division:"+total);
    	  }
      else if(key==4) {
    	  int total=firstNum%secondNum;
          System.out.println("modulus:"+total);
    	  }*/
      switch (key)
      {
      case 0:
      {
    	  int total=firstNum+secondNum;
          System.out.println("Addition:"+total); 
          break;
      }
      case 1:
      {
    	  int total=firstNum-secondNum;
          System.out.println("subraction:"+total); 
          break;
      }
      case 2:
      {
    	  int total=firstNum*secondNum;
          System.out.println("multiplication:"+total); 
          break;
      }
      case 3:
      {
    	  int total=firstNum/secondNum;
          System.out.println("division:"+total); 
          break;
      }
      case 4:
      {
    	  int total=firstNum/secondNum;
          System.out.println("modulus:"+total); 
          break;
      }
      
      
      
      }sc.close();
      

	}
      

}
