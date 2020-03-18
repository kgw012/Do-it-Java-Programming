package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		//library 생성
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = new Book[3];
		
		
		//library 인스턴스 생성
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");

		bookArray3[0] = new Book();
		bookArray3[1] = new Book();
		bookArray3[2] = new Book();

		//복사하기1~2(얕은복사)
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		//복사하기1~3(깊은복사)
		for(int i=0; i < bookArray1.length; i++) {
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
			bookArray3[i].setBookName(bookArray1[i].getBookName());
		}
		
		//책 바꾸기
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		//출력1
		/*
		System.out.println("-----bookArray1-----");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showInfo();
		}

		System.out.println("-----bookArray2-----");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
		
		System.out.println("-----bookArray3-----");
		for(int i=0; i<bookArray3.length; i++) {
			bookArray3[i].showInfo();
		}
		*/
		
		//쉽게출력하기
		String[] strArr = {"Java","Android","C"};
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3};
		for(int s : arr) {
			System.out.println(s);
		}
		
		for(Book s : bookArray1) {
			s.showInfo();
			
		}
	}

}
