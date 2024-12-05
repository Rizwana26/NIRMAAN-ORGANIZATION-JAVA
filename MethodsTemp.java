package day9;

public class MethodsTemp {
	String addition(int a,int b) {
		return "Addition:"+ (a+b);
	}
	int subtraction(int a,int b) {
		return  a-b;
	}
	void multiplication(int a,int b) {
		System.out.println("multiplication:"+(a*b));
	}
	void division(int a,int b) {
		System.out.println(a/b);
	}
	void modulus(int a,int b) {
		System.out.println("modulus:"+(a%b));
	}
	MethodsTemp(){
		
	}

}
//Accessing class to class
//Accessing class in another package we need to import