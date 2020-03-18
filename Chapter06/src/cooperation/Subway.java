package cooperation;

public class Subway {

	String lineNumber;
	int passengerCount;
	int money;

	// 생성자 (지하철 번호를 받아야 생성되는 생성자)
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	// 승객을 태웠을 때 호출되는 메서드
	public void take(int money) {
		passengerCount++; // 승객 수 증가
		this.money += money; // 돈 증가
	}

	// 지하철 정보를 보여주는 메서드
	public void showInfo() {
		System.out.println("지하철" + lineNumber + "의 승객 수는" + passengerCount + "명 이고, 수입은" + money + "입니다.");
	}
}
