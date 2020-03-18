package loopexample;

public class Practice5 {

	public static void main(String[] args) {
		int total = 7;
		
		for(int i = 0; i < total; i++) {
			System.out.print("     ");

			if(i>total/2) {
				for(int j = 0; j < (i - total/2); j++) {
					System.out.print("  ");
				}
				for(int j = 0; j < (total*2 -1 -2*i); j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			
			else {
				for(int j = 0; j < (total/2 - i); j++) {
					System.out.print("  ");
				}
				for(int j = 0; j < (2*i + 1); j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
	}

}
