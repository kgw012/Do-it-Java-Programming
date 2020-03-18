package gametest;

public class SuperLevel extends PlayerLevel {
	
	private SuperLevel() {}
	private static SuperLevel instance = new SuperLevel();
	
	
	public static SuperLevel getInstance() {
		return instance;
	}

	@Override
	public void run() {
		System.out.println("���� ������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump�մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�Ƹ���� turn�մϴ�.");
	}

	@Override
	public void showPlayerInfo() {
		System.out.println("===== ��� �����Դϴ�. =====");
	}

}
