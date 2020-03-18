package loopexample;

public class Practice1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int value = 0;
		char operator = '+';
		
		if(operator == '+') {
			value = num1 + num2;
			System.out.printf("%d %s %d = %d", num1, operator, num2, value);
			}
		else if(operator == '-') {
			value = num1 - num2;
			System.out.printf("%d %s %d = %d", num1, operator, num2, value);
		}
		else if(operator == '*') {
			value = num1 * num2;
			System.out.printf("%d %s %d = %d", num1, operator, num2, value);
		}
		else if(operator == '/') {
			value = num1 / num2;
			System.out.printf("%d %s %d = %d", num1, operator, num2, value);
		}
		else {
			System.out.println("¿À·ù");
		}
		
		
	}

}
