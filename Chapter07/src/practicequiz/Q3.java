package practicequiz;

public class Q3 {
	
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		int i=0;
		
		for(int j = 1; j<=10; j++) {
			if(j%2 == 0) {
				arr[i] = j;
				System.out.println(arr[i]);
				i++;
			}
		}
		
	}

}