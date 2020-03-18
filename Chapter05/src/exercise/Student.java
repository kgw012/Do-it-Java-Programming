package exercise;

public class Student {
	int studentID;
	String studentName;
	
	Subject korean;
	Subject math;
	
	
	//생성자
	public Student() {
		korean = new Subject("국어");
		math = new Subject("수학");
	}
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subject("국어");
		math = new Subject("수학");
	}
	
	//점수입력용 메소드
	public void setKorean(int score) {
		korean.setScore(score);
	}
	public void setMath(int score) {
		math.setScore(score);
	}
	
	//정보출력용 메소드
	public void showStudentInfo() {
		System.out.println(studentName +"의 점수는 아래와 같습니다.");
		System.out.println(korean.getSubjectName() +" : "+ korean.getScore());
		System.out.println(math.getSubjectName() +" : "+ math.getScore());
	}
	
}
