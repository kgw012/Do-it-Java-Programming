package streampractice.inputstream;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		
		System.out.println("���ĺ� �������� ���� ���͸� ��������");
		
		int i;
		try {
			while((i = System.in.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
