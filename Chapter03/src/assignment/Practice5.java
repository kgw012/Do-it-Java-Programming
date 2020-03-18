package assignment;

public class Practice5 {

	public static void main(String[] args) {
		int num1 = 2;   // 0010
		int num2 = 10;  // 1010
		
		System.out.println(num1 & num2);   // 0010 = 2
		System.out.println(num1 | num2);   // 1010 = 10
		System.out.println(num1 ^ num2);   // 1000 = 8
		System.out.println(~num1);         // 1111111111111101 -> 10 -> 11 -> 3  thus, -3
		
		
		
	}

}
