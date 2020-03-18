package project.school;

import java.util.ArrayList;

import project.school.grade.BasicGrade;
import project.school.grade.Grade;
import project.school.grade.MajorGrade;
import project.utils.Define;

public class Score {
	private int point;
	private Subject subject;
	private Student student;
	private static ArrayList<Score> scoreList = new ArrayList<>();
	
	//������
	public Score(Subject subject, Student student, int point) {
		this.subject = subject;
		this.student = student;
		this.point = point;
	}
	
	//��� ��Ÿ���� �޼���
	public String getGrade() {
		String grade;
		Grade[] gradeType = {new BasicGrade(), new MajorGrade()};
		
		if(subject.getSubjectID() != student.getMajorSubject().getSubjectID())
			grade = gradeType[Define.GRADETYPE_BASIC].getGrade(point);
		else grade = gradeType[Define.GRADETYPE_MAJOR].getGrade(point);
			
		return grade;
	}
	
	//get �޼���
	public static ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public int getPoint() {
		return point;
	}

	public Subject getSubject() {
		return subject;
	}

	public Student getStudent() {
		return student;
	}
	

}
