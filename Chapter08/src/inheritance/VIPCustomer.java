package inheritance;

public class VIPCustomer extends Customer {

	private int agentID;
	private static int sAgentID = 100;
	
	
	//������
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

	
	//���翬�� �� ��¸޼���(�������̵�)
	@Override
	public void contactAgent() {
		System.out.println("============���翬��============");
		System.out.println(name + "(" + ID + ")" + " ����, ������ ���翡�� ����˴ϴ�. ����� ��ȣ��  " + agentID + "�� �Դϴ�.");
	}

	//�����ȣ get�޼ҵ�
	public int getAgentID() {
		return agentID;
	}

		
}