package exercise;

public class OrderClass {
	long orderNumber;
	String customerID;
	String orderDate;
	String customerName;
	String orderProductNumber;
	String deliveryAddress;
	
	public void showOrderInfo() {
		System.out.println("주문 번호 : " + orderNumber);
		System.out.println("주문자 아이디 : " + customerID);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + customerName);
		System.out.println("주문 상품 번호 : " + orderProductNumber);
		System.out.println("배송 주소 : " + deliveryAddress);
		
		return;
	}

}
