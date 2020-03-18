package project.school;

import java.util.ArrayList;

import project.utils.Define;

public class Student {
	
	private String studentName;
	private int studentID;
	private Subject majorSubject;
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	//������
	public Student(String studentName, Subject majorSubject) {
		this.studentName = studentName;
		this.studentID = Define.staticStudentID++;
		this.majorSubject = majorSubject;
	}
	
	//�л� �ν��Ͻ��� scoreList �������� �޼���
	public ArrayList<Score> getScoreList() {
		ArrayList<Score> scoreList = new ArrayList<>();
		for(int i=0; i<Score.getScoreList().size(); i++) {
			if(Score.getScoreList().get(i).getStudent().getStudentID() == studentID)
				scoreList.add(Score.getScoreList().get(i));
		}
		return scoreList;
	}
	
	//getter&setter
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

}