package practice;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;

	// constructor
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}

	// take Bus
	public void take() {
		money += 1500;
		passengerCount++;
	}

	// showInformation
	public void showInfo() {
		System.out.println(subwayNumber + "ȣ�� ����ö�� ������" + money + "�� �Դϴ�. ���� �°� ����" + passengerCount + "�� �Դϴ�.");
	}
}
