package exercise;

public class OrderClass {
	long orderNumber;
	String customerID;
	String orderDate;
	String customerName;
	String orderProductNumber;
	String deliveryAddress;
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ��ȣ : " + orderNumber);
		System.out.println("�ֹ��� ���̵� : " + customerID);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ��� �̸� : " + customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + orderProductNumber);
		System.out.println("��� �ּ� : " + deliveryAddress);
		
		return;
	}

}
