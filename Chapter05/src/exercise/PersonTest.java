package exercise;

public class PersonTest {

	public static void main(String[] args) {
		PersonClass person1 = new PersonClass();
		person1.age = 40;
		person1.name = "James";
		person1.married = true;
		person1.children = 3;
		
		System.out.println(person1.age);
		System.out.println(person1.name);
		System.out.println(person1.married);
		System.out.println(person1.children);
	}
}
