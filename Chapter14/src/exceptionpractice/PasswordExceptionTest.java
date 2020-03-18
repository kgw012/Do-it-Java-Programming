package exceptionpractice;

public class PasswordExceptionTest {
	
	private String password;
	
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) throws PasswordException{
		if(password == null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�.");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڿ��θ� �̷���� �� �����ϴ�.");
		}
		else if(password.length()<=5) {
			throw new PasswordException("��й�ȣ�� 6�� �̻��̾�� �մϴ�.");
		}
		this.password = password;
	}



	public static void main(String[] args) {
		
		PasswordExceptionTest password = new PasswordExceptionTest();
		
		try {
			password.setPassword(null);
		} catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			password.setPassword("kimgilwoong");
		} catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			password.setPassword("kgw01");
		} catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
