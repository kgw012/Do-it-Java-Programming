package gamelevel;

public class BeginnerLevel extends PlayerLevel {
	
	private static BeginnerLevel instance = new BeginnerLevel();
	private BeginnerLevel() {}

	public static BeginnerLevel getInstance() {
		return instance;
	}

	public static void setInstance(BeginnerLevel instance) {
		BeginnerLevel.instance = instance;
	}

	@Override
	public void run() {
		System.out.println("천천히 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("jump 못행");		
	}

	@Override
	public void turn() {
		System.out.println("turn 못행");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초보자 레벨입니다. *****");		
	}

}
