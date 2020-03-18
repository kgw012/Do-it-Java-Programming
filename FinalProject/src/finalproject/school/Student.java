package finalproject.school;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private Subject majorSubject;
	private ArrayList<Score> scoreList = new ArrayList<Score>();

	
	//생성자
	public Student(int studentID, String studentName, Subject majorSubject) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	
	//점수 넣기 메서드
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}

	
	//getset메서드
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

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

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
}
