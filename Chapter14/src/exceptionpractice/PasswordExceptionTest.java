package exceptionpractice;

public class PasswordExceptionTest {
	
	private String password;
	
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) throws PasswordException{
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 문자열로만 이루어질 수 없습니다.");
		}
		else if(password.length()<=5) {
			throw new PasswordException("비밀번호는 6자 이상이어야 합니다.");
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
