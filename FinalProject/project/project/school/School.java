package project.school;

import java.util.ArrayList;

public class School {
	
	//�б� �̱�������
	private static School instance = new School();
	private static String schoolName = "���������б�";

	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	//�л�,���� ����Ʈ
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	//�л�&����&���� �߰��ϱ� �޼���
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
	
	//������û �޼���
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
