package project.school;

import java.util.ArrayList;

public class Subject {
	
	private String subjectName;
	private int subjectID;
	private ArrayList<Student> studentList = new ArrayList<>();
	
	//생성자
	public Subject(int subjectID, String subjectName) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}
	
	//과목 인스턴스의 scoreList 가져오기 메서드
		public ArrayList<Score> getScoreList() {
			ArrayList<Score> scoreList = new ArrayList<>();
			for(int i=0; i<Score.getScoreList().size(); i++) {
				if(Score.getScoreList().get(i).getSubject().getSubjectID() == subjectID)
					scoreList.add(Score.getScoreList().get(i));
			}
			return scoreList;
		}
	
	
	
	//getter&setter
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

}