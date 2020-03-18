package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;

	// 생성자 (버스 번호를 받아야 생성되는 생성자)
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 승객을 태웠을 때 호출되는 메서드
	public void take(int money) {
		passengerCount++; // 승객 수 증가
		this.money += money; // 돈 증가
	}

	// 버스 정보를 보여주는 메서드
	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객 수는" + passengerCount + "명 이고, 수입은" + money + "입니다.");
	}
}
