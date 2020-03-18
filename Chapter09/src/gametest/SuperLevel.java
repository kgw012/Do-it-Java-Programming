package gametest;

public class SuperLevel extends PlayerLevel {
	
	private SuperLevel() {}
	private static SuperLevel instance = new SuperLevel();
	
	
	public static SuperLevel getInstance() {
		return instance;
	}

	@Override
	public void run() {
		System.out.println("아주 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("아름답게 turn합니다.");
	}

	@Override
	public void showPlayerInfo() {
		System.out.println("===== 고급 레벨입니다. =====");
	}

}
