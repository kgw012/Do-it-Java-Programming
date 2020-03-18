package interfacepractice;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 4;
		
		Calc calc = new CompleteCalculator();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
	}

}
