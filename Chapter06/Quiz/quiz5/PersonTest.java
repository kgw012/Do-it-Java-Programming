package quiz5;

public class PersonTest {

	public static void main(String[] args) {

		// 사람 생성
		Person person1 = new Person("김길웅", 150000);
		Person person2 = new Person("이길동", 180000);

		// 메뉴 구입
		person1.buyStarCafe("americano"); // 4,000원
		person1.buyStarCafe("latte"); // 4,300원
		person2.buyBeanCafe("latte"); // 4,500원

		// 사람 정보 나타내기
		person1.showInfo();
		person2.showInfo();

		// 다방 정보 나타내기
		StarCafe.showInfo();
		BeanCafe.showInfo();

	}

}
