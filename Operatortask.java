package day1;

public class Operatortask {
	public static void main(String args[])
	{
		System.out.println("Arithmetic Operations:");
		int firstNum=50;
		int secondNum=10;
		int thirdNum=30;
		int fourthNum=45;
		
		int addition= firstNum+secondNum;
		System.out.println("Addition:"+ addition);
		int subraction=firstNum-secondNum;
		System.out.println("Subraction:"+ subraction);
		int multiplication=firstNum*secondNum;
		System.out.println("Multiplication:"+multiplication );
		int division=firstNum/secondNum;
		System.out.println("Division:"+division );
		int modulus=firstNum%secondNum;
		System.out.println("Modulus:"+modulus );
		
		
		System.out.println("Relational Operations:");
		boolean x=firstNum>secondNum;
		System.out.println("50>10:"+x);
		boolean y=firstNum<secondNum;
		System.out.println("50<10:"+y);
		boolean z=firstNum>=secondNum;
		System.out.println("50>=10:"+z);
		boolean r=firstNum<=secondNum;
		System.out.println("50<=10:"+r);
		boolean w=firstNum==secondNum;
		System.out.println("50==10:"+w);
		boolean p=firstNum!=secondNum;
		System.out.println("50!=10:"+p);
		
		System.out.println("Logical Operations:");
		boolean and=((firstNum>secondNum)&&(thirdNum<fourthNum));
		System.out.println("(50>10 AND 30<45:)"+and);
		boolean or=((firstNum>secondNum)||(thirdNum>fourthNum));
		System.out.println("(50>10 OR 30<45:)"+or);
		
		
		
		
		
		
		
	
	}

}
