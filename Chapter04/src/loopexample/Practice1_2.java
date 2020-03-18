package loopexample;

public class Practice1_2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int value = 0;
		char operator = '+';
		
		switch(operator) {
			case '+' : value = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + value);
				break;
			
			case '-' : value = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + value);
				break;
			
			case '*' : value = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + value);
				break;
			
			case '/' : value = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + value);
				break;
			
			default : System.out.println("¿À·ù");
		}
	}

}
