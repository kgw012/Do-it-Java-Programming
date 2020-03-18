package stream;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
				
		sList.stream().forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		
	}
}
