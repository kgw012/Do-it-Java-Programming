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
		System.out.println("���� �޸��ϴ�");
	}

	@Override
	public void jump() {
		System.out.println("���� jump�մϴ�.");		
	}

	@Override
	public void turn() {
		System.out.println("turn ����");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** �߱��� �����Դϴ�. *****");		
	}

}
