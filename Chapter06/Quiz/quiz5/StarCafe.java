package quiz5;

public class StarCafe {

	static int money;

	// ���ٹ� �̱������� ����
	private StarCafe() {
	}

	private static StarCafe starCafeInstance = new StarCafe();

	public static StarCafe getInstance() {
		return starCafeInstance;
	}

	// �޴���
	private static int americano = 4000;
	private static int latte = 4300;

	// ���� �� ���ٹ濡 ������ �ִ� �޼���
	public static void buy(String menu) {
		switch (menu) {
		case "americano":
			money += americano;
			break;

		case "latte":
			money += latte;
			break;

		default:
			System.out.println("���ٹ��� �޴� �̸��� ����ġ �ʽ��ϴ�");
		}
	}

	// �ܺο��� ���ٹ��� �޴������� �����پ��� �޼���
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

	// ���ٹ� ������ ��Ÿ���ִ� �޼���
	public static void showInfo() {
		System.out.println("���ٹ��� ������ ���� " + money + "�� �Դϴ�.");
	}
}
