package gametest;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		this.level = BeginnerLevel.getInstance();
		
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		System.out.println("===== ������ �ö����ϴ�. =====");
	}
	
	
	public void play(int count) {
		level.go(count);
	}
}
