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
		System.out.println("���� ���� �޸��ϴ�");
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
	public void showLevelMessage() {
		System.out.println("***** ����� �����Դϴ�. *****");		
	}

}
