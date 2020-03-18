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
		System.out.println("õõ�� �޸��ϴ�");
	}

	@Override
	public void jump() {
		System.out.println("jump ����");		
	}

	@Override
	public void turn() {
		System.out.println("turn ����");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** �ʺ��� �����Դϴ�. *****");		
	}

}
