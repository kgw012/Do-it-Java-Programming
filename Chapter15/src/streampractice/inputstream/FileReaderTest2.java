package streampractice.inputstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
	public static void main(String[] args) {

		try(FileReader fr = new FileReader("reader.txt")){
			char[] buf = new char[3];
			int i;
			while((i = fr.read(buf)) != -1) {
				for(int j=0; j<i; j++) {
					System.out.print(buf[j]);
				}
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
