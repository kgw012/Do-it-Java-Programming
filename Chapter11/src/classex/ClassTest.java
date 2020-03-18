package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person p = new Person();
		Class pClass = Class.forName("classex.Person");
		
		Person p2 = (Person)pClass.newInstance();
		
	}

}
