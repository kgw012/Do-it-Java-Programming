package practicequiz;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<Dog>(5);
		
		list.add(0, new Dog("�ٵ���", "������"));
		list.add(1, new Dog("�����", "�޸��þ�"));
		list.add(2, new Dog("�Ϳ��", "���׸���"));
		list.add(3, new Dog("����", "�ڽ���Ʈ"));
		list.add(4, new Dog("������", "Ǫ��"));
		
		for(Dog s : list) {
			System.out.println(s.showDogInfo());
		}
	}

}