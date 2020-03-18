package stream;

public class Customer {
	private String name;
	private int age;
	private int price;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		if(age>=15) price = 100;
		else price = 50;
	}
		
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name +"("+age+"¼¼, "+price+"¸¸¿ø)";
	}
	
	
}
