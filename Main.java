package day9;

public class Main {
	public static void main(String args[]) {
		//accessing values for MethodsTemp class in this class by creating object
		MethodsTemp call=new MethodsTemp();
		System.out.println(call.addition(10, 20));
		System.out.println(call.subtraction(40, 20));
		call.multiplication(4, 6);
		call.division(30, 6);
		call.modulus(60, 07);


		
		
	}

}
