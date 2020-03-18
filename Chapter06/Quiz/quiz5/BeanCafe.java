package quiz5;

public class BeanCafe {

	static int money;

	// 콩다방 싱글톤패턴 적용
	private BeanCafe() {
	}

	private static BeanCafe beanCafeInstance = new BeanCafe();

	public static BeanCafe getInstance() {
		return beanCafeInstance;
	}

	// 메뉴들
	private static int americano = 4200;
	private static int latte = 4500;

	// 구매 시 콩다방에 수입을 주는 메서드
	public static void buy(String menu) {
		switch (menu) {
		case "americano":
			money += americano;
			break;

		case "latte":
			money += latte;
			break;

		default:
			System.out.println("콩다방의 메뉴 이름이 적절치 않습니다");
		}

	}

	// 외부에서 콩다방의 메뉴가격을 가져다쓰는 메서드
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

	// 콩다방 정보를 나타내주는 메서드
	public static void showInfo() {
		System.out.println("콩다방의 수입은 현재 " + money + "원 입니다.");
	}

}
