package gamelevel;

public class AdvancedLevel extends PlayerLevel {


	private static AdvancedLevel instance = new AdvancedLevel();
	private AdvancedLevel() {}

	public static AdvancedLevel getInstance() {
		return instance;
	}

	public static void setInstance(AdvancedLevel instance) {
		AdvancedLevel.instance = instance;
	}
	
	
	@Override
	public void run() {
		System.out.println("빨리 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");		
	}

	@Override
	public void turn() {
		System.out.println("turn 못행");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. *****");		
	}

}
