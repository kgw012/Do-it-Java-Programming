package practice;

public class FunctionTest4 {

	public static void main(String[] args) {
		divide(21, 4);
	}
	
	public static void divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;
		}
		else {
			double result = (double)num1 / (double)num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
			return;
		}
	}
}
