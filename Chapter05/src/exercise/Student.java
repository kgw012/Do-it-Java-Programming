package exercise;

public class Student {
	int studentID;
	String studentName;
	
	Subject korean;
	Subject math;
	
	
	//������
	public Student() {
		korean = new Subject("����");
		math = new Subject("����");
	}
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subject("����");
		math = new Subject("����");
	}
	
	//�����Է¿� �޼ҵ�
	public void setKorean(int score) {
		korean.setScore(score);
	}
	public void setMath(int score) {
		math.setScore(score);
	}
	
	//������¿� �޼ҵ�
	public void showStudentInfo() {
		System.out.println(studentName +"�� ������ �Ʒ��� �����ϴ�.");
		System.out.println(korean.getSubjectName() +" : "+ korean.getScore());
		System.out.println(math.getSubjectName() +" : "+ math.getScore());
	}
	
}
