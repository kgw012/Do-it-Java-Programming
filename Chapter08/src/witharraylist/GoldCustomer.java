package witharraylist;

public class GoldCustomer extends Customer {

	
	//������
	public GoldCustomer(int ID, String name) {
		super(ID, name);
		grade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
}