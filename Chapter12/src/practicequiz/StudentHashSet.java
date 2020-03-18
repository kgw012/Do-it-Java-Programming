package practicequiz;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSet {
	HashSet<Student> hashSet = new HashSet<>();
	
	//add
	public void addStudent(Student student) {
		hashSet.add(student);
	}
	
	//remove
	public boolean removeStudent(String studentID) {
		Iterator<Student> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Student student = ir.next();
			String tempID = student.getStudentID();
			if(tempID == studentID) {
				hashSet.remove(student);
				return true;
			}
		}
		System.out.println(studentID +" ID를 찾을 수 없습니다.");
		return false;
	
	}
	
	//showAll
	public void showAll() {
		for(Student student : hashSet) {
			System.out.println(student);
		}
	}
}
