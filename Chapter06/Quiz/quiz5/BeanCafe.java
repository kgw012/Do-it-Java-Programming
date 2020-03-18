package quiz5;

public class BeanCafe {

	static int money;

	// ��ٹ� �̱������� ����
	private BeanCafe() {
	}

	private static BeanCafe beanCafeInstance = new BeanCafe();

	public static BeanCafe getInstance() {
		return beanCafeInstance;
	}

	// �޴���
	private static int americano = 4200;
	private static int latte = 4500;

	// ���� �� ��ٹ濡 ������ �ִ� �޼���
	public static void buy(String menu) {
		switch (menu) {
		case "americano":
			money += americano;
			break;

		case "latte":
			money += latte;
			break;

		default:
			System.out.println("��ٹ��� �޴� �̸��� ����ġ �ʽ��ϴ�");
		}

	}

	// �ܺο��� ��ٹ��� �޴������� �����پ��� �޼���
	public static int getPrice(String menu) {
		switch (menu) {
		case "americano":
			return americano;

		case "latte":
			return latte;

		default:
			return 0;

		}

	}

	// ��ٹ� ������ ��Ÿ���ִ� �޼���
	public static void showInfo() {
		System.out.println("��ٹ��� ������ ���� " + money + "�� �Դϴ�.");
	}

}
