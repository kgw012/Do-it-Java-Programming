package inheritance;

public class GoldCustomer extends Customer {

	
	//»ý¼ºÀÚ
	public GoldCustomer(int ID, String name) {
		super(ID, name);
		this.ID = ID;
		this.name = name;
		grade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
}