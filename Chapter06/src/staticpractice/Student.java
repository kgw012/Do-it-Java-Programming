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
		System.out.println(studentName + " �л��� �й� : " + studentNumber);
		System.out.println(studentName + " �л��� ī���ȣ : " + cardNumber);
	}
}
