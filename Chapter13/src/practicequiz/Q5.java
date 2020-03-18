package practicequiz;

interface Calc{
	public int add(int num1, int num2);
}

public class Q5 {

	public static void main(String[] args) {
		Calc cal = (num1, num2) -> num1+num2;
		System.out.println(cal.add(30, 40));
		System.out.println(cal.add(50, 70));
	}

}
