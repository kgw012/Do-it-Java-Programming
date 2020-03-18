package inheritance;

public class VIPCustomer extends Customer {

	private int agentID;
	private static int sAgentID = 100;
	
	
	//생성자
	public VIPCustomer(int ID, String name) {
		super(ID, name);
		this.ID = ID;
		this.name = name;
		grade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		sAgentID++;
		agentID = sAgentID;
	}

	
	//상담사연결 시 출력메세지(오버라이드)
	@Override
	public void contactAgent() {
		System.out.println("============상담사연결============");
		System.out.println(name + "(" + ID + ")" + " 고객님, 배정된 상담사에게 연결됩니다. 담당자 번호는  " + agentID + "번 입니다.");
	}

	//상담사번호 get메소드
	public int getAgentID() {
		return agentID;
	}

		
}