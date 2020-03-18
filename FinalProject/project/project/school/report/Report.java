package project.school.report;

import java.util.ArrayList;

import project.school.School;
import project.school.Student;
import project.school.Subject;

public class Report {
	
	private School seoulTech = School.getInstance();
	private ArrayList<Subject> subjectList = seoulTech.getSubjectList();
	private ArrayList<Student> studentList = seoulTech.getStudentList();
	
	private StringBuffer buffer = new StringBuffer();
	private String line1;
	private String line2;
	private String title;
	private String header;
	private StringBuffer bodyBuffer = new StringBuffer();
	private String body;
	
	//싱글톤 패턴
	private Report() {}
	private static Report instance = new Report();
	public static Report getInstance() {
		if(instance == null) {
			instance = new Report();
		}
		return instance;
	}
	
	
	//양식 적용 메서드
	private String getReportForm() {
		buffer.setLength(0);
		bodyBuffer.setLength(0);
		buffer.append(line2 + "\n");
		buffer.append(title + "\n\n");
		buffer.append(header + "\n");
		buffer.append(line1 + "\n");
		buffer.append(body);
		buffer.append(line2 + "\n");
		return buffer.toString();
	}

	//전체 학생 명단 제공 메서드
	public String getAllStudentList() {
		line1 = "------------------------------";
		line2 = "==============================";
		title = "         " + School.getSchoolName() + " 전체 학생 명단";
		header = "   학번    |  이름   | 전공과목 | 수강과목 수";
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			bodyBuffer.append(student.getStudentID() + " | " + student.getStudentName() + "  |  " +
					student.getMajorSubject().getSubjectName() + "     |    " + student.getSubjectList().size());
			bodyBuffer.append("\n");
		}
		body = bodyBuffer.toString();
		getReportForm();
		return buffer.toString();
	}
	
	//전체 과목 명단 제공 메서드
	public String getAllSubjectList() {
		line1 = "-----------------------";
		line2 = "=======================";
		title = "  " + School.getSchoolName() + " 전체 과목 명단";
		header = " 과목번호 | 과목명  | 수강학생 수";
		for(int i=0; i<subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			bodyBuffer.append(subject.getSubjectID() + "  |  " + subject.getSubjectName() + "    |   " 
					+ subject.getStudentList().size());
			bodyBuffer.append("\n");
		}
		body = bodyBuffer.toString();
		getReportForm();
		return buffer.toString();
	}
	
	
	
	//해당 과목의 수강학생 명단 제공 메서드
	public String getStudentList(Subject subject) {
		line1 = "------------------------------";
		line2 = "==============================";
		title = "           " + subject.getSubjectName() +"(" + subject.getSubjectID() +")" + " 수강학생 명단";
		header = "   학번    |  이름   | 전공과목 | 점수(등급)";
		for(int i=0; i<subject.getStudentList().size(); i++) {
			Student student = subject.getStudentList().get(i);
			
			int point = 0;
			String grade = null;
			for(int j=0; j<student.getScoreList().size(); j++) {
				if(student.getScoreList().get(j).getSubject().getSubjectID() == subject.getSubjectID()) {
					point = student.getScoreList().get(j).getPoint();
					grade = student.getScoreList().get(j).getGrade();
				}
			}
			bodyBuffer.append(student.getStudentID() + " | " + student.getStudentName() + "  |  " +
					student.getMajorSubject().getSubjectName() + "     | " + point + "(" + grade + ")");
			bodyBuffer.append("\n");
		}
		body = bodyBuffer.toString();
		getReportForm();
		return buffer.toString();
	}
	
	//해당 학생의 수강과목 명단 제공 메서드
	public String getSubjectList(Student student) {
		line1 = "------------------------";
		line2 = "========================";
		title = "    " + student.getStudentName() +"(" + student.getStudentID() +")" + " 수강과목 명단";
		header = "  과목번호  | 과목명   | 점수(등급)";
		for(int i=0; i<student.getSubjectList().size(); i++) {
			Subject subject = student.getSubjectList().get(i);
			
			int point = 0;
			String grade = null;
			for(int j=0; j<subject.getScoreList().size(); j++) {
				if(subject.getScoreList().get(j).getStudent().getStudentID() == student.getStudentID()) {
					point = subject.getScoreList().get(j).getPoint();
					grade = subject.getScoreList().get(j).getGrade();
				}
			}
			bodyBuffer.append("  " + subject.getSubjectID() + " |  " + subject.getSubjectName() + "    | " +
					point + "(" + grade + ")");
			bodyBuffer.append("\n");
		}
		body = bodyBuffer.toString();
		getReportForm();
		return buffer.toString();
	}
}