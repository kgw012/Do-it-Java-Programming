package loopexample;

public class ForExample2 {

	public static void main(String[] args) {
		int dan;
		int times;
		int value=0;
		
		for (dan=2; dan<=9; dan++) {
			System.out.println(dan +"��");
			for (times=1; times<=9; times++) {
				value = dan * times;
				System.out.println(dan + "x" + times + "=" + value);
			}
			System.out.println();
		}
	}

}
