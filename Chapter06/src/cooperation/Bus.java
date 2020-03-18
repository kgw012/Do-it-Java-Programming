package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;

	// ������ (���� ��ȣ�� �޾ƾ� �����Ǵ� ������)
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// �°��� �¿��� �� ȣ��Ǵ� �޼���
	public void take(int money) {
		passengerCount++; // �°� �� ����
		this.money += money; // �� ����
	}

	// ���� ������ �����ִ� �޼���
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°� ����" + passengerCount + "�� �̰�, ������" + money + "�Դϴ�.");
	}
}
