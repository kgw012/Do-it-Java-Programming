package gametest;

public class MainBoard {
	public static void main(String[] args) {
		Player player1 = new Player();
		player1.play(1);
		
		player1.upgradeLevel(AdvancedLevel.getInstance());
		player1.play(2);
		
		player1.upgradeLevel(SuperLevel.getInstance());
		player1.play(3);
		
		
	}
}
