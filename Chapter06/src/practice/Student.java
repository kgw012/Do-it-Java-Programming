package practice;

public class Student {
	String studentName;
	int money;

	// constructor
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// take bus
	public void takeBus(Bus bus) {
		bus.take();
		money -= 1000;
	}

	// take subway
	public void takeSubway(Subway subway) {
		subway.take();
		money -= 1500;
	}

	// show information
	public void showInfo() {
		System.out.println(studentName + " �л��� �������� " + money + "�� �Դϴ�.");
	}
}
