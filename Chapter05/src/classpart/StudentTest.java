package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentName("±è±æ¿õ");
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		student2.setStudentName("±è±æµ¿");
		System.out.println(student2.getStudentName());
		
		Student student3 = new Student();
		student3.studentName = "±è±æ¼±";
		System.out.println(student3.getStudentName());
	}

}
