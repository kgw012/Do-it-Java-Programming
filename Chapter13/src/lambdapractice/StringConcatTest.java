package lambdapractice;

public class StringConcatTest {

	public static void main(String[] args) {
		//�߻�޼��� �׽�Ʈ
		String s1 = "hello";
		String s2 = "java";
		
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		//�͸���Ŭ���� �׽�Ʈ
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		concat2.makeString(s1, s2);
		
		//���ٽ� �׽�Ʈ
		
		StringConcat concat3 = (s, v) -> System.out.println(s +", "+ v);
		concat3.makeString(s1, s2);
		
	}

}
