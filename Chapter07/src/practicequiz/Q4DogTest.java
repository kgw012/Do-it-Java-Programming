package practicequiz;

public class Q4DogTest {

	public static void main(String[] args) {
		Dog[] list = new Dog[5];
		
		for(int i=0; i<list.length; i++) {
			list[i] = new Dog();
		}
		
		
		list[0].setName("�ٵ���");
		list[0].setType("������");
		list[1].setName("�����");
		list[1].setType("�޸��þ�");
		list[2].setName("�Ϳ��");
		list[2].setType("���׸���");
		list[3].setName("����");
		list[3].setType("�ڽ���Ʈ");
		list[4].setName("������");
		list[4].setType("Ǫ��");
		
		System.out.println("====for�� ���====");
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i].showDogInfo());
		}
		
		System.out.println("====���� for�� ���====");
		for(Dog s : list) {
			System.out.println(s.showDogInfo());
		}
		
	}

}