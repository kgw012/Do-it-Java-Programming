package quiz5;

public class Person {
	String name;
	int money;

	// 사람 생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 별다방에서 구입 시 메서드
	public void buyStarCafe(String menu) {
		StarCafe.buy(menu);
		money -= StarCafe.getPrice(menu);
	}

	// 콩다방에서 구입 시 메서드
	public void buyBeanCafe(String menu) {
		BeanCafe.buy(menu);
		money -= BeanCafe.getPrice(menu);
	}

	// 사람 정보를 나타내주는 메서드
	public void showInfo() {
		System.out.println(name + " 님의 잔액은 " + money + "원 입니다.");
	}
}
