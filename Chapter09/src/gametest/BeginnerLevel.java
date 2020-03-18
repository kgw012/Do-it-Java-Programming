package gametest;

public class BeginnerLevel extends PlayerLevel {

	private BeginnerLevel() {}
	private static BeginnerLevel instance = new BeginnerLevel();
	
	public static BeginnerLevel getInstance() {
		return instance;
	}


	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump가 뭐임?");
	}

	@Override
	public void turn() {
		System.out.println("turn이 뭐임?");
	}

	@Override
	public void showPlayerInfo() {
		System.out.println("===== 초급자 레벨입니다. =====");
	}

}
