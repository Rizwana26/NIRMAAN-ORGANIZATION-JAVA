package day8;

public class Methods {
	String addition(int a,int b,int c) {
		return "Addition:"+(a+b+c);
	}
	
	String addition(int a,int b ) {
		return "Addition:"+(a+b);
		
	}
	int subraction(int a,int b) {
		return a-b;
		
	}
	void multiplication(int a,int b) {
		System.out.println(a*b);
	}
	
	public static void main(String args[]) {
		Methods md=new Methods();
		System.out.println(md.addition(5,15, 20));
		System.out.println(md.addition(5, 10));
		System.out.println(md.subraction(40, 20));
		md.multiplication(2, 6);
		
	}

}

//String addition(String a,String b ) {
//	return "Addition:"+(a+b);
//	
//}