package streampractice.outputstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("하이용");
			fw.write(buf, 1, 3);
			fw.write("65");
		} catch(IOException e) {
			e.printStackTrace();
		} 
		System.out.println("출력완료");
	}

}
