package array;

public class BookArray {

	public static void main(String[] args) {
		
		//library 생성
		Book[] library = new Book[5];
		
		//출력
		for(int i=0; i<library.length; i++)
			System.out.println(library[i]);
		
		//library 인스턴스 생성
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		//출력
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i=0; i<library.length; i++) {
			library[i].showInfo();
		}
		
	}

}
