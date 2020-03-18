package practicequiz;

public class Q4DogTest {

	public static void main(String[] args) {
		Dog[] list = new Dog[5];
		
		for(int i=0; i<list.length; i++) {
			list[i] = new Dog();
		}
		
		
		list[0].setName("¹ÙµÏÀÌ");
		list[0].setType("Áøµ¾°³");
		list[1].setName("¾ó·èÀÌ");
		list[1].setType("´Þ¸¶½Ã¾È");
		list[2].setName("±Í¿ä¹Ì");
		list[2].setType("¸»Å×¸®¾î");
		list[3].setName("ÃÊÄÚ");
		list[3].setType("´Ú½ºÈÆÆ®");
		list[4].setName("º¹¼þÀÌ");
		list[4].setType("Çªµé");
		
		System.out.println("====for¹® »ç¿ë====");
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i].showDogInfo());
		}
		
		System.out.println("====Çâ»óµÈ for¹® »ç¿ë====");
		for(Dog s : list) {
			System.out.println(s.showDogInfo());
		}
		
	}

}