package generics;

public class Plastic extends Material{

	
	
	@Override
	public String toString() {
		return "Plastic 재료를 사용하는 프린터입니다.";
	}

	@Override
	public void doprint() {
		System.out.println("Plastic으로 출력합니다.");
	}

}
