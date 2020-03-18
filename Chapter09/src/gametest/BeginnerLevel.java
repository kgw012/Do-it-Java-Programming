package gametest;

public class BeginnerLevel extends PlayerLevel {

	private BeginnerLevel() {}
	private static BeginnerLevel instance = new BeginnerLevel();
	
	public static BeginnerLevel getInstance() {
		return instance;
	}


	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("jump�� ����?");
	}

	@Override
	public void turn() {
		System.out.println("turn�� ����?");
	}

	@Override
	public void showPlayerInfo() {
		System.out.println("===== �ʱ��� �����Դϴ�. =====");
	}

}
