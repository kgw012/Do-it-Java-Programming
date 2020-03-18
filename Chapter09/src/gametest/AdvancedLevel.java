package gametest;

public class AdvancedLevel extends PlayerLevel {

	private AdvancedLevel() {}
	private static AdvancedLevel instance = new AdvancedLevel();
	
	public static AdvancedLevel getInstance() {
		return instance;
	}


	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� jump�մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("turn�� ����?");
	}

	@Override
	public void showPlayerInfo() {
		System.out.println("===== �߱��� �����Դϴ�. =====");
	}

}
