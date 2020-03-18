package gametest;

public class AdvancedLevel extends PlayerLevel {

	private AdvancedLevel() {}
	private static AdvancedLevel instance = new AdvancedLevel();
	
	public static AdvancedLevel getInstance() {
		return instance;
	}


	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn이 뭐임?");
	}

	@Override
	public void showPlayerInfo() {
		System.out.println("===== 중급자 레벨입니다. =====");
	}

}
