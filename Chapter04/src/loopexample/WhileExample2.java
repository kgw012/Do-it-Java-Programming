package loopexample;

public class WhileExample2 {

	public static void main(String[] args) {
		int dan=2;
		int times=1;
		int value;
		
		while (dan<10) {
			System.out.println(dan + "´Ü");
			
			while (times<10) {
				value=dan*times;
				System.out.println(dan + "x" + times + "=" + value);
				times++;
			}
			
			dan++;
			times=1;
			System.out.println();
		}
	}

}
