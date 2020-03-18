package practicequiz;

public class Student implements Comparable<Student> {
	
	private String studentID;
	private String studentName;
	
	public Student(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(studentID);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(student.getStudentID() == studentID) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return studentName+"("+studentID+")";
	}

	@Override
	public int compareTo(Student student) {
		return (this.studentID.compareTo(student.studentID));
	}
}