package assignment;

public class OperationEx5 {

	public static void main(String[] args) {

		int num1 = 0b0101;
		int num2 = 0b1010;

		int result = num1 & num2;
		System.out.println(result);
		result = num1 | num2;
		System.out.println(result);

		num2 = 11;
		result = num1 & num2;
		System.out.println(result);

		int num3 = 5;
		System.out.println(num3 << 1);
		System.out.println(num3);
		System.out.println(num3 << 2);
		System.out.println(num3 << 3);

		System.out.println(num3 >> 1);
	}

}
