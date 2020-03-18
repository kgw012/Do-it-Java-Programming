package exceptionpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingTest3 {

	public static void main(String[] args) {
	
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("apractice.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�׻� ����˴ϴ�.");
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}

}
