package witharraylist;

import inheritance.Customer;
import inheritance.GoldCustomer;
import inheritance.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {
		
		//�� ����
		Customer customer1 = new Customer(10001, "�����");
		Customer customer2 = new GoldCustomer(10002, "����");
		Customer customer3 = new VIPCustomer(10003, "���¯");
		Customer customer4 = new VIPCustomer(10004, "���¯2");
		
		//��ǰ ����
		customer1.buyProduct("����", 2000);
		customer2.buyProduct("������ s20", 1000000);
		customer3.buyProduct("����������Ʈ", 50000);
		customer4.buyProduct("VIP������������", 2000000);
		customer1.buyProduct("������", 5000);
		
		//���� ����
		customer1.contactAgent();
		customer2.contactAgent();
		customer3.contactAgent();
		customer4.contactAgent();
		
	}

}