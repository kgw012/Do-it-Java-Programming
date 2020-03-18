package streampractice.inputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output2.txt");
		try(fos) {
			byte[] bs = new byte[26];
			byte data = 'A';
			
			for(int i=0; i<bs.length; i++, data++) {
				bs[i] = data;
			}
			
			fos.write(bs, 2, 10);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
