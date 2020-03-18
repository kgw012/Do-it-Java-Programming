package exercise;

public class Subject {
	String subjectName;
	int score;
	
	//持失切
	public Subject() {}
	public Subject(String name) {
		subjectName = name;
	}
	
	
	//getset五社球
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
