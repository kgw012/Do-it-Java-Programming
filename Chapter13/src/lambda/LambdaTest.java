package lambda;

interface PrintString{
	void showString(String str);
}


public class LambdaTest {

	public static void main(String[] args) {
		
		//���ٽ� �ٷξ���
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		//���ٽ� �Ű������� �Ѱܼ� ����
		showMyString(lambdaPrint);

		//�������� �޾Ƽ� ����
		PrintString reStr = returnPrint();
		reStr.showString("hello");
		
		
	}
	
	//���ٽ� �Ű����� �޾Ƽ� ����ϴ� �޼���
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	//���ٽ� �������� �����ִ� �޼���
	public static PrintString returnPrint() {
		return s->System.out.println(s + " world");
	}


}
