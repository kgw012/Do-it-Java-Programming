package exercise;

public class OrderTest {

	public static void main(String[] args) {
		OrderClass order1 = new OrderClass();
		order1.orderNumber = 201803120001L;
		order1.customerID = "abc123";
		order1.orderDate = "2018�� 3�� 12��";
		order1.customerName = "ȫ���";
		order1.orderProductNumber = "PD0345-12";
		order1.deliveryAddress = "����� �������� ���ǵ��� 20����";
		
		order1.showOrderInfo();
	}

}
