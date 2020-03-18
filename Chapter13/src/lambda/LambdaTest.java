package lambda;

interface PrintString{
	void showString(String str);
}


public class LambdaTest {

	public static void main(String[] args) {
		
		//람다식 바로쓰기
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		//람다식 매개변수로 넘겨서 쓰기
		showMyString(lambdaPrint);

		//리턴으로 받아서 쓰기
		PrintString reStr = returnPrint();
		reStr.showString("hello");
		
		
	}
	
	//람다식 매개변수 받아서 출력하는 메서드
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	//람다식 리턴으로 보내주는 메서드
	public static PrintString returnPrint() {
		return s->System.out.println(s + " world");
	}


}
