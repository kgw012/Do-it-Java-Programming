package practicequiz;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<Dog>(5);
		
		list.add(0, new Dog("¹ÙµÏÀÌ", "Áøµ¾°³"));
		list.add(1, new Dog("¾ó·èÀÌ", "´Ş¸¶½Ã¾È"));
		list.add(2, new Dog("±Í¿ä¹Ì", "¸»Å×¸®¾î"));
		list.add(3, new Dog("ÃÊÄÚ", "´Ú½ºÈÆÆ®"));
		list.add(4, new Dog("º¹¼şÀÌ", "Çªµé"));
		
		for(Dog s : list) {
			System.out.println(s.showDogInfo());
		}
	}

}