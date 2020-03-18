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
		System.out.println(subwayNumber + "호선 지하철의 수입은" + money + "원 입니다. 현재 승객 수는" + passengerCount + "명 입니다.");
	}
}
