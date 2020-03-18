package practicequiz;

public class Dog {
	private String name;
	private String type;
	
	//생성자
	public Dog() {}
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	
	
	//getset메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//정보출력 메서드
	public String showDogInfo() {
		return name + " , " + type;
	}
	
	
}
