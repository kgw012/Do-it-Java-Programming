package loopexample;

public class Practice2 {

	public static void main(String[] args) {
		int dan;
		int times;
		int value=0;
		
		for (dan=2; dan<10; dan++) {
			if(dan%2==1)
				continue;
			System.out.println(dan +"´Ü");
			for (times=1; times<=9; times++) {
				value = dan * times;
				System.out.println(dan + "x" + times + "=" + value);
			}
			System.out.println();
		}
	}

}