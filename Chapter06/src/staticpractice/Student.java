package staticpractice;

public class Student {

	String studentName;
	int studentNumber;
	int cardNumber;
	static int serialNumber = 10000;

	public Student(String studentName) {
		this.studentName = studentName;
		serialNumber++;
		studentNumber = serialNumber;
		cardNumber = studentNumber + 100;
	}

	public void showInfo() {
		System.out.println(studentName + " 학생의 학번 : " + studentNumber);
		System.out.println(studentName + " 학생의 카드번호 : " + cardNumber);
	}
}
