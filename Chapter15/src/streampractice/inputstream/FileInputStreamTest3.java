package streampractice.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		byte[] bs = new byte[10];
		int i;
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			while((i = fis.read(bs)) != -1) {
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}