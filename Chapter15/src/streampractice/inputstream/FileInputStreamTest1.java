package streampractice.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("input.txt");
		try (fis) {
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			} catch(NullPointerException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}

}
