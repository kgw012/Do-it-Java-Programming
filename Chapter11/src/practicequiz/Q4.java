package practicequiz;

class MyDog{
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return name+type;
	}
	
	
}

public class Q4 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("�۸���", "������");
		System.out.println(dog);
	}
}
