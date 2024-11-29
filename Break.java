package RIZ;

public class Break {
	public static void main(String args[]) {
		for(int i=0;i<=200;i++) {
			if(i==101) {
				break;
				
			}
			else if(i==50) {
				continue;
				
			}
			else {
				System.out.println(i);
			}
		}
	}

}
