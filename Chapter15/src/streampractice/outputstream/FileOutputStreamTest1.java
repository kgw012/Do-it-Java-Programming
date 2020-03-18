package streampractice.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(1);
			fos.write(2);
			fos.write(3);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}