package exercise;

public class OrderTest {

	public static void main(String[] args) {
		OrderClass order1 = new OrderClass();
		order1.orderNumber = 201803120001L;
		order1.customerID = "abc123";
		order1.orderDate = "2018년 3월 12일";
		order1.customerName = "홍길순";
		order1.orderProductNumber = "PD0345-12";
		order1.deliveryAddress = "서울시 영등포구 여의도동 20번지";
		
		order1.showOrderInfo();
	}

}
