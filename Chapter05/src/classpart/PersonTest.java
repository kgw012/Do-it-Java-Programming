package classpart;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person("±è±æ¿õ");
		person1.height = 177.8F;
		person1.weight = 83.2F;
		person1.gender = 'M';
		person1.married = false;
		
		Person person2 = new Person("±è±æµ¿", 173.4F, 73F);
		
		System.out.println(person1.name);
		System.out.println(person2.name);
		
	}
}