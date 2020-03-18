package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		/*
		int[][] arr = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr.length*arr[0].length);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println((arr[i][j]));
			}
		}
		*/
		char[][] alphabets = new char[2][13];
		
		char al = 'A';
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++, al++) {
				alphabets[i][j] = al;
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}
	}

}