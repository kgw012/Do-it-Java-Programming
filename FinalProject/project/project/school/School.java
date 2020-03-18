package project.school;

import java.util.ArrayList;

public class School {
	
	//학교 싱글톤패턴
	private static School instance = new School();
	private static String schoolName = "서라벌고등학교";

	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	//학생,과목 리스트
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	//학생&과목&점수 추가하기 메서드
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	public void addStudent(Student student) {
		studentList.add(student);
	}
	public void addScore(Subject subject, Student student, int point) {
		Score score = new Score(subject, student, point);
		score.getScoreList().add(score);
	}
	
	//수강신청 메서드
	public void register(Student student, Subject subject) {
		student.getSubjectList().add(subject);
		subject.getStudentList().add(student);
	}
	
	//getters
	public static String getSchoolName() {
		return schoolName;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
	
}
