package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;

	// 생성자 (학생 이름, 학생의 소지금을 넣어야 생성되는 생성자)
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// 버스를 타는 메서드 (버스라는 클래스를 받아야함)
	public void takeBus(Bus bus) {
		bus.take(1000); // 버스가 1000원을 얻는 메서드
		money -= 1000; // 학생의 돈이 1000원 빠져나가는 메서드
	}

	// 지하철을 타는 메서드 (지하철이라는 클래스를 받아야함)
	public void takeSubway(Subway Subway) {
		Subway.take(1500); // 지하철이 1500원을 얻는 메서드
		money -= 1500; // 학생의 돈이 1500원 빠져나가는 메서드
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다.");
	}
}
