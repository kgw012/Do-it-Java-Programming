package stream;

import java.util.ArrayList;

public class CustomerTravelTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<>();

		list.add(new Customer("이순신", 40));
		list.add(new Customer("김유신", 20));
		list.add(new Customer("홍길동", 13));
		
		list.stream().forEach(c->System.out.println(c));
		int sum = list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(sum+"만원");
	}

}