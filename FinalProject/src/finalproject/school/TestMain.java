package finalproject.school;

import finalproject.school.report.GenerateGradeReport;
import finalproject.utils.Define;

public class TestMain {
	Subject korean;
	Subject math;
	
	School seoulTech = School.getInstance();
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}
	
	public void createSubject() {
		korean = new Subject("±¹¾î", Define.KOREAN);
		math = new Subject("¼öÇÐ", Define.MATH);
		
		seoulTech.addSubject(korean);
		seoulTech.addSubject(math);
	}
	
	public void createStudent() {
		Student student1 = new Student(12141313, "±è±æ¿õ", math);
		Student student2 = new Student(12141314, "±è±æ¼±", math);
		Student student3 = new Student(12141315, "±è±æµ¿", math);
		Student student4 = new Student(12141316, "±è±æÁß", korean);
		Student student5 = new Student(12141317, "±è±æÇÑ", korean);
		
		seoulTech.addStudent(student1);
		seoulTech.addStudent(student2);
		seoulTech.addStudent(student3);
		seoulTech.addStudent(student4);
		seoulTech.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 100);

		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);

		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);

		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);

		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);
	
		
	}
	
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentID(), subject, point);
		student.addSubjectScore(score);
	}

}
