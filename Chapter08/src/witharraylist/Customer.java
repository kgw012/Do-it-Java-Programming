package witharraylist;

public class Customer {
	protected int ID;
	protected String name;
	protected String grade;
	protected int bonusPoint = 0;
	protected double bonusRatio;
	protected double saleRatio;
	
	//생성자
	public Customer(int ID, String name) {
		this.ID = ID;
		this.name = name;
		grade = "SILVER";
		bonusRatio = 0.01;
		saleRatio = 0;
	}
	
	//물건 구매시 메서드(할인, 적립, 안내메세지 출력)
	public void buyProduct(String productName, int productPrice) {
		int price = productPrice - (int)((double)productPrice*saleRatio);  //할인율 적용가 계산
		int plusBonusPoint = (int)(price*bonusRatio); //적립되는 마일리지 계산 
		bonusPoint += plusBonusPoint;     //적립
		System.out.println("============상품구매완료============");
		System.out.println(name + "(" + ID + ")" + " 고객님, " + productName + " 상품 구매가 완료되었습니다. "
				+ grade + " 등급의 할인율, " + (int)(saleRatio*100) + "%가 적용된 가격은 " + price + "원 입니다.");
		System.out.println("* 구매가의 " + (int)(bonusRatio*100) + "%가 적립됩니다. 마일리지 " + plusBonusPoint + "점이 적립되었습니다.");
		System.out.println("* 현재 보유한 마일리지 : " + bonusPoint + "점");
		
		//등급 업!!   ************아직미구현..ㅠㅠ 클래스 어떻게바꾸냐?
		if(bonusPoint>=10000 && grade=="SILVER") {
			
		}
	}
	
	
	
	
	//정보출력
	public void showCustomerInfo() {
		System.out.println("============고객정보출력============");
		System.out.println(name + "(" + ID + ")" + " 고객님의 등급은 " + grade + " 입니다. 현재 적립된 포인트는 " + bonusPoint + "점 입니다.");
		System.out.println(grade + " 등급의 적립률은 " + bonusRatio*100 + "% 이며, 할인율은 " + saleRatio*100 + "% 입니다.");
	}
	
	//상담사연결 시 출력메세지
	public void contactAgent() {
		System.out.println("============상담사연결============");
		System.out.println(name + "(" + ID + ")" + " 고객님, 배정된 상담사가 없으므로 상담실로 연결됩니다. 연결은 10분 이상 지연될 수 있습니다.");
	}
	

}