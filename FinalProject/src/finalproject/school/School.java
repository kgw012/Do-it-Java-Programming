package finalproject.school;

import java.util.ArrayList;

public class School {
	private static School instance = new School();
	
	private static String SCHOOL_NAME = "서울과학기술대학교";
	
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null)
			instance = new School();
		return instance;
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	public ArrayList<Subject> getSubjectList(){
		return subjectList;
	}
	
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
}
