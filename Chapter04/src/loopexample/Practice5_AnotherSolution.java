package loopexample;

public class Practice5_AnotherSolution {

	public static void main(String[] args) {
		int total = 7;
		int space = total/2;
		int star = 1;
		
		for(int i=0; i<total; i++) {
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			
			if(i<(total/2)) {
				space-=1;
				star+=2;
			}
			
			else {
				space+=1;
				star-=2;				
			}
			System.out.println("");
		}
	}

}
