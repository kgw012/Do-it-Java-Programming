package interfacepractice;

public class CompleteCalculator extends Calculator {


	@Override
	public double divide(int num1, int num2) {
		if(num2==0) {
			return ERROR;
		}
		else {
			return (double)num1/(double)num2;
		}
	}

}
