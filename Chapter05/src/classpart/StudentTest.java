package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentName("����");
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		student2.setStudentName("��浿");
		System.out.println(student2.getStudentName());
		
		Student student3 = new Student();
		student3.studentName = "��漱";
		System.out.println(student3.getStudentName());
	}

}
