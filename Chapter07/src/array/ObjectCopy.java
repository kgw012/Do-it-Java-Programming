package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		//library ����
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = new Book[3];
		
		
		//library �ν��Ͻ� ����
		bookArray1[0] = new Book("�¹���1", "������");
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");

		bookArray3[0] = new Book();
		bookArray3[1] = new Book();
		bookArray3[2] = new Book();

		//�����ϱ�1~2(��������)
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		//�����ϱ�1~3(��������)
		for(int i=0; i < bookArray1.length; i++) {
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
			bookArray3[i].setBookName(bookArray1[i].getBookName());
		}
		
		//å �ٲٱ�
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		//���1
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
		
		//��������ϱ�
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
