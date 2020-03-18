package practice;

public class FunctionTest5 {

	public static void main(String[] args) {
		fourCarculate(9,4);
	}
	
	public static void fourCarculate(int n1, int n2) {
		int result = n1 + n2;
		System.out.println(n1 +"+"+ n2 +"="+ result);
		
		result = n1 - n2;
		System.out.println(n1 +"-"+ n2 +"="+ result);
		
		result = n1 * n2;
		System.out.println(n1 +"*"+ n2 +"="+ result);
		
		double result2 = (double)n1 / (double)n2;
		System.out.println(n1 +"/"+ n2 +"="+ result2);
	}
}
