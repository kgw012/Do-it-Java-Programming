package witharraylist;

import inheritance.Customer;
import inheritance.GoldCustomer;
import inheritance.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {
		
		//고객 생성
		Customer customer1 = new Customer(10001, "김길은");
		Customer customer2 = new GoldCustomer(10002, "김길금");
		Customer customer3 = new VIPCustomer(10003, "김길짱");
		Customer customer4 = new VIPCustomer(10004, "김길짱2");
		
		//상품 구매
		customer1.buyProduct("가위", 2000);
		customer2.buyProduct("갤럭시 s20", 1000000);
		customer3.buyProduct("설날선물세트", 50000);
		customer4.buyProduct("VIP전용라운지예약", 2000000);
		customer1.buyProduct("테이프", 5000);
		
		//상담사 연결
		customer1.contactAgent();
		customer2.contactAgent();
		customer3.contactAgent();
		customer4.contactAgent();
		
	}

}