package cooperation;

public class Subway {

	String lineNumber;
	int passengerCount;
	int money;

	// ������ (����ö ��ȣ�� �޾ƾ� �����Ǵ� ������)
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	// �°��� �¿��� �� ȣ��Ǵ� �޼���
	public void take(int money) {
		passengerCount++; // �°� �� ����
		this.money += money; // �� ����
	}

	// ����ö ������ �����ִ� �޼���
	public void showInfo() {
		System.out.println("����ö" + lineNumber + "�� �°� ����" + passengerCount + "�� �̰�, ������" + money + "�Դϴ�.");
	}
}
