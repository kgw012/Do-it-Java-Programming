package practice;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;

	// constructor
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// take Bus
	public void take() {
		money += 1000;
		passengerCount++;
	}

	// showInformation
	public void showInfo() {
		System.out.println(busNumber + "�� ������ ������ " + money + "�� �Դϴ�. ���� �°� ���� " + passengerCount + "�� �Դϴ�.");
	}
}
