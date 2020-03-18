package quiz5;

public class StarCafe {

	static int money;

	// 별다방 싱글톤패턴 적용
	private StarCafe() {
	}

	private static StarCafe starCafeInstance = new StarCafe();

	public static StarCafe getInstance() {
		return starCafeInstance;
	}

	// 메뉴들
	private static int americano = 4000;
	private static int latte = 4300;

	// 구매 시 별다방에 수입을 주는 메서드
	public static void buy(String menu) {
		switch (menu) {
		case "americano":
			money += americano;
			break;

		case "latte":
			money += latte;
			break;

		default:
			System.out.println("별다방의 메뉴 이름이 적절치 않습니다");
		}
	}

	// 외부에서 별다방의 메뉴가격을 가져다쓰는 메서드
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

	// 별다방 정보를 나타내주는 메서드
	public static void showInfo() {
		System.out.println("별다방의 수입은 현재 " + money + "원 입니다.");
	}
}
