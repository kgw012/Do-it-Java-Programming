package gamelevel;

public class SuperLevel extends PlayerLevel {
	
	private static SuperLevel instance = new SuperLevel();
	private SuperLevel() {}
	
	public static SuperLevel getInstance() {
		return instance;
	}

	public static void setInstance(SuperLevel instance) {
		SuperLevel.instance = instance;
	}

	@Override
	public void run() {
		System.out.println("아주 빨리 달립니다");
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
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. *****");		
	}

}
