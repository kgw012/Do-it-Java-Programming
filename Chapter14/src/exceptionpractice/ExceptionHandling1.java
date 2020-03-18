package exceptionpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("apractice.txt.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
