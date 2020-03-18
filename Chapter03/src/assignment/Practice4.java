package assignment;

public class Practice4 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		boolean result;

		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result); // ´ä : False

		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result); // ´ä : True

		System.out.println(!result); // ´ä : False

	}

}
