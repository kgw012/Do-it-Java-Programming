package scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextcCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų�, ����Ⱑ ���� ���� �������� ����մϴ�.");
	}

}
