package lambdapractice;

public class StringConcatTest {

	public static void main(String[] args) {
		//추상메서드 테스트
		String s1 = "hello";
		String s2 = "java";
		
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		//익명내부클래스 테스트
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		concat2.makeString(s1, s2);
		
		//람다식 테스트
		
		StringConcat concat3 = (s, v) -> System.out.println(s +", "+ v);
		concat3.makeString(s1, s2);
		
	}

}
