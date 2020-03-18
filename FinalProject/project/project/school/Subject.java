package project.school;

import java.util.ArrayList;

public class Subject {
	
	private String subjectName;
	private int subjectID;
	private ArrayList<Student> studentList = new ArrayList<>();
	
	//������
	public Subject(int subjectID, String subjectName) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}
	
	//���� �ν��Ͻ��� scoreList �������� �޼���
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