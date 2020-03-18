package stream;

import java.util.ArrayList;

public class CustomerTravelTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<>();

		list.add(new Customer("�̼���", 40));
		list.add(new Customer("������", 20));
		list.add(new Customer("ȫ�浿", 13));
		
		list.stream().forEach(c->System.out.println(c));
		int sum = list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(sum+"����");
	}

}