package witharraylist;

public class Customer {
	protected int ID;
	protected String name;
	protected String grade;
	protected int bonusPoint = 0;
	protected double bonusRatio;
	protected double saleRatio;
	
	//������
	public Customer(int ID, String name) {
		this.ID = ID;
		this.name = name;
		grade = "SILVER";
		bonusRatio = 0.01;
		saleRatio = 0;
	}
	
	//���� ���Ž� �޼���(����, ����, �ȳ��޼��� ���)
	public void buyProduct(String productName, int productPrice) {
		int price = productPrice - (int)((double)productPrice*saleRatio);  //������ ���밡 ���
		int plusBonusPoint = (int)(price*bonusRatio); //�����Ǵ� ���ϸ��� ��� 
		bonusPoint += plusBonusPoint;     //����
		System.out.println("============��ǰ���ſϷ�============");
		System.out.println(name + "(" + ID + ")" + " ����, " + productName + " ��ǰ ���Ű� �Ϸ�Ǿ����ϴ�. "
				+ grade + " ����� ������, " + (int)(saleRatio*100) + "%�� ����� ������ " + price + "�� �Դϴ�.");
		System.out.println("* ���Ű��� " + (int)(bonusRatio*100) + "%�� �����˴ϴ�. ���ϸ��� " + plusBonusPoint + "���� �����Ǿ����ϴ�.");
		System.out.println("* ���� ������ ���ϸ��� : " + bonusPoint + "��");
		
		//��� ��!!   ************�����̱���..�Ф� Ŭ���� ��Թٲٳ�?
		if(bonusPoint>=10000 && grade=="SILVER") {
			
		}
	}
	
	
	
	
	//�������
	public void showCustomerInfo() {
		System.out.println("============���������============");
		System.out.println(name + "(" + ID + ")" + " ������ ����� " + grade + " �Դϴ�. ���� ������ ����Ʈ�� " + bonusPoint + "�� �Դϴ�.");
		System.out.println(grade + " ����� �������� " + bonusRatio*100 + "% �̸�, �������� " + saleRatio*100 + "% �Դϴ�.");
	}
	
	//���翬�� �� ��¸޼���
	public void contactAgent() {
		System.out.println("============���翬��============");
		System.out.println(name + "(" + ID + ")" + " ����, ������ ���簡 �����Ƿ� ���Ƿ� ����˴ϴ�. ������ 10�� �̻� ������ �� �ֽ��ϴ�.");
	}
	

}