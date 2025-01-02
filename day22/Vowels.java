package day22;

public class Vowels {
	public static void main(String[] args) {
		String name=" RIZWANA BEGUM";
		String removespace="a&b ";
		for(char letter:name.toCharArray()) {
			if(letter==' '){
				
			}
			else {
				removespace+=letter;
			}
		//	System.out.println(letter);
		}
		System.out.println(removespace);
	}
	
		
	}
	


