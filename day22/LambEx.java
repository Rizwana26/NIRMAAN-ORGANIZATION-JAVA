package day22;

interface cal{
	//SINGLE ABSTRACT METHOD
	//void add() ;
	
	
	//PARAMETRIZED  ABSTRACT METHOD
	void add(int a,int b); 
	
}

public class LambEx {
	public static void main(String[] args) {
		int a=5;
		int b=30;
		cal c1=(x,y)->{
			System.out.println(a+b);
		};
		c1.add(a, b);
	}

}
