package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;

	// ������ (�л� �̸�, �л��� �������� �־�� �����Ǵ� ������)
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// ������ Ÿ�� �޼��� (������� Ŭ������ �޾ƾ���)
	public void takeBus(Bus bus) {
		bus.take(1000); // ������ 1000���� ��� �޼���
		money -= 1000; // �л��� ���� 1000�� ���������� �޼���
	}

	// ����ö�� Ÿ�� �޼��� (����ö�̶�� Ŭ������ �޾ƾ���)
	public void takeSubway(Subway Subway) {
		Subway.take(1500); // ����ö�� 1500���� ��� �޼���
		money -= 1500; // �л��� ���� 1500�� ���������� �޼���
	}

	public void showInfo() {
		System.out.println(studentName + "���� ���� ����" + money + "�� �Դϴ�.");
	}
}
