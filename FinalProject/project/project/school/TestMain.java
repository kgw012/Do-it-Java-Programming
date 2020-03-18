package project.school;

import project.school.report.Report;
import project.utils.Define;

public class TestMain {

	public static void main(String[] args) {
		
		//학교,보고서 인스턴스생성
		School seoulTech = School.getInstance();
		Report report = Report.getInstance();
		
		//과목, 학생 생성
		Subject math = new Subject(Define.MATH, "수학");
		Subject korean = new Subject(Define.KOREAN, "국어");
		Student student1 = new Student("김길웅", math);
		Student student2 = new Student("이호연", korean);
		Student student3 = new Student("조광현", korean);
		Student student4 = new Student("원유민", korean);
		Student student5 = new Student("성재현", math);
		Student student6 = new Student("여인우", math);
		Student student7 = new Student("고주원", math);
		Student student8 = new Student("박권일", math);
		
		//학교에 과목, 학생 등록
		seoulTech.addSubject(math);
		seoulTech.addSubject(korean);
		seoulTech.addStudent(student1);
		seoulTech.addStudent(student2);
		seoulTech.addStudent(student3);
		seoulTech.addStudent(student4);
		seoulTech.addStudent(student5);
		seoulTech.addStudent(student6);
		seoulTech.addStudent(student7);
		seoulTech.addStudent(student8);
		
		//수강신청
		seoulTech.register(student1, math);
		seoulTech.register(student1, korean);
		seoulTech.register(student2, math);
		seoulTech.register(student2, korean);
		seoulTech.register(student3, math);
		seoulTech.register(student3, korean);
		seoulTech.register(student4, math);
		seoulTech.register(student4, korean);
		seoulTech.register(student5, math);
		seoulTech.register(student5, korean);
		seoulTech.register(student6, math);
		seoulTech.register(student6, korean);
		seoulTech.register(student7, math);
		seoulTech.register(student7, korean);
		seoulTech.register(student8, math);
		seoulTech.register(student8, korean);
		
		//점수입력
		seoulTech.addScore(math, student1, 100);
		seoulTech.addScore(math, student2, 100);
		seoulTech.addScore(math, student3, 100);
		seoulTech.addScore(math, student4, 100);
		seoulTech.addScore(math, student5, 100);
		seoulTech.addScore(math, student6, 100);
		seoulTech.addScore(math, student7, 100);
		seoulTech.addScore(math, student8, 100);
		seoulTech.addScore(korean, student1, 100);
		seoulTech.addScore(korean, student2, 100);
		seoulTech.addScore(korean, student3, 100);
		seoulTech.addScore(korean, student4, 100);
		seoulTech.addScore(korean, student5, 100);
		seoulTech.addScore(korean, student6, 100);
		seoulTech.addScore(korean, student7, 100);
		seoulTech.addScore(korean, student8, 100);
		
		//report 출력
		System.out.println(report.getAllSubjectList());
		System.out.println(report.getAllStudentList());
		System.out.println(report.getStudentList(math));
		System.out.println(report.getStudentList(korean));
		System.out.println(report.getSubjectList(student1));
	}

}
