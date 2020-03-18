package practice;

public class FunctionTest2 {

	public static void main(String[] args) {
		System.out.println(getTenTotal());
	}
	
	public static int getTenTotal() {
		int total = 0;
		for(int i=1; i<=10; i++) {
			total+=i;
		}
		return total;
	}
}
