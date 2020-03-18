package practicequiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book implements Comparable{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return name+"("+price+")";
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Book) {
			Book o2 = (Book)o;
			return this.name.compareTo(o2.getName());
		}
		else return 0;
	}

}

public class Q7 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		int sumPrice = bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(sumPrice);
		
		bookList.stream().filter(c->c.getPrice()>=20000).sorted().forEach(c->System.out.println(c));
	}
}
