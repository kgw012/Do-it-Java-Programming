package loopexample;

public class Practice4 {

	public static void main(String[] args) {
		int total = 7;
		int space = total/2 + 1;
		for(int i = 0; i < (total/2 + 1); i++) {
			System.out.print("     ");
			for(int j = 0; j < (space -1 -i); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2 * i + 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
