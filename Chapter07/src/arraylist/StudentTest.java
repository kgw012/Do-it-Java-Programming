package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student(12141313, "����");
		student1.addSubject("����", 87);
		student1.addSubject("����", 100);
		
		student1.showStudentInfo();
		
		System.out.println("===========");
		
		Student student2 = new Student(12130313, "��漱");
		student2.addSubject("����", 97);
		student2.addSubject("����", 100);
		student2.addSubject("����", 68);
		
		student2.showStudentInfo();
	}

}
