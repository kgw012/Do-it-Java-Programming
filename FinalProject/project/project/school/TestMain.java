package project.school;

import project.school.report.Report;
import project.utils.Define;

public class TestMain {

	public static void main(String[] args) {
		
		//�б�,���� �ν��Ͻ�����
		School seoulTech = School.getInstance();
		Report report = Report.getInstance();
		
		//����, �л� ����
		Subject math = new Subject(Define.MATH, "����");
		Subject korean = new Subject(Define.KOREAN, "����");
		Student student1 = new Student("����", math);
		Student student2 = new Student("��ȣ��", korean);
		Student student3 = new Student("������", korean);
		Student student4 = new Student("������", korean);
		Student student5 = new Student("������", math);
		Student student6 = new Student("���ο�", math);
		Student student7 = new Student("���ֿ�", math);
		Student student8 = new Student("�ڱ���", math);
		
		//�б��� ����, �л� ���
		seoulTech.addSubject(math);
		seoulTech.addSubject(korean);
		seoulTech.addStudent(student1);
		seoulTech.addStudent(student2);
		seoulTech.addStudent(student3);
		seoulTech.addStudent(student4);
		seoulTech.addStudent(student5);
		seoulTech.addStudent(student6);
		seoulTech.addStudent(student7);
		seoulTech.addStudent(student8);
		
		//������û
		seoulTech.register(student1, math);
		seoulTech.register(student1, korean);
		seoulTech.register(student2, math);
		seoulTech.register(student2, korean);
		seoulTech.register(student3, math);
		seoulTech.register(student3, korean);
		seoulTech.register(student4, math);
		seoulTech.register(student4, korean);
		seoulTech.register(student5, math);
		seoulTech.register(student5, korean);
		seoulTech.register(student6, math);
		seoulTech.register(student6, korean);
		seoulTech.register(student7, math);
		seoulTech.register(student7, korean);
		seoulTech.register(student8, math);
		seoulTech.register(student8, korean);
		
		//�����Է�
		seoulTech.addScore(math, student1, 100);
		seoulTech.addScore(math, student2, 100);
		seoulTech.addScore(math, student3, 100);
		seoulTech.addScore(math, student4, 100);
		seoulTech.addScore(math, student5, 100);
		seoulTech.addScore(math, student6, 100);
		seoulTech.addScore(math, student7, 100);
		seoulTech.addScore(math, student8, 100);
		seoulTech.addScore(korean, student1, 100);
		seoulTech.addScore(korean, student2, 100);
		seoulTech.addScore(korean, student3, 100);
		seoulTech.addScore(korean, student4, 100);
		seoulTech.addScore(korean, student5, 100);
		seoulTech.addScore(korean, student6, 100);
		seoulTech.addScore(korean, student7, 100);
		seoulTech.addScore(korean, student8, 100);
		
		//report ���
		System.out.println(report.getAllSubjectList());
		System.out.println(report.getAllStudentList());
		System.out.println(report.getStudentList(math));
		System.out.println(report.getStudentList(korean));
		System.out.println(report.getSubjectList(student1));
	}

}
