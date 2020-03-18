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
		System.out.println(busNumber + "번 버스의 수입은 " + money + "원 입니다. 현재 승객 수는 " + passengerCount + "명 입니다.");
	}
}
