package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student(12141313, "김길웅");
		student1.addSubject("국어", 87);
		student1.addSubject("수학", 100);
		
		student1.showStudentInfo();
		
		System.out.println("===========");
		
		Student student2 = new Student(12130313, "김길선");
		student2.addSubject("영어", 97);
		student2.addSubject("국어", 100);
		student2.addSubject("수학", 68);
		
		student2.showStudentInfo();
	}

}
