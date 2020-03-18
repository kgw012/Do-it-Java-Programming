package loopexample;

public class Practice3 {

	public static void main(String[] args) {
		int dan;
		int times;
		int value=0;
		
		for (dan=2; dan<10; dan++) {
			
			System.out.println(dan +"´Ü");
			
			for (times=1; ; times++) {
				
				if(dan<times)
					break;
				
				value = dan * times;
				System.out.println(dan + "x" + times + "=" + value);
			}
			System.out.println();
		}
	}

}
