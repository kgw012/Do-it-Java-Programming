package quiz5;

public class Person {
	String name;
	int money;

	// ��� ������
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// ���ٹ濡�� ���� �� �޼���
	public void buyStarCafe(String menu) {
		StarCafe.buy(menu);
		money -= StarCafe.getPrice(menu);
	}

	// ��ٹ濡�� ���� �� �޼���
	public void buyBeanCafe(String menu) {
		BeanCafe.buy(menu);
		money -= BeanCafe.getPrice(menu);
	}

	// ��� ������ ��Ÿ���ִ� �޼���
	public void showInfo() {
		System.out.println(name + " ���� �ܾ��� " + money + "�� �Դϴ�.");
	}
}
