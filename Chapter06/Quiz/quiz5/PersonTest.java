package quiz5;

public class PersonTest {

	public static void main(String[] args) {

		// ��� ����
		Person person1 = new Person("����", 150000);
		Person person2 = new Person("�̱浿", 180000);

		// �޴� ����
		person1.buyStarCafe("americano"); // 4,000��
		person1.buyStarCafe("latte"); // 4,300��
		person2.buyBeanCafe("latte"); // 4,500��

		// ��� ���� ��Ÿ����
		person1.showInfo();
		person2.showInfo();

		// �ٹ� ���� ��Ÿ����
		StarCafe.showInfo();
		BeanCafe.showInfo();

	}

}
