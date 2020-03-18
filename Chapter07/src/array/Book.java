package array;

public class Book {
	
	private String bookName;
	private String author;
	
	//생성자
	public Book() {}
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	//getset메서드
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//정보메서드
	public void showInfo() {
		System.out.println(bookName +" , "+ author);
	}
	
	
}
