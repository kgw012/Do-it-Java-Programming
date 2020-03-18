package generics;

public class Powder extends Material{

	@Override
	public void doprint() {
		System.out.println("Powder로 출력합니다.");
	}

	@Override
	public String toString() {
		return "Powder 재료로 출력하는 프린터입니다.";
	}

}
