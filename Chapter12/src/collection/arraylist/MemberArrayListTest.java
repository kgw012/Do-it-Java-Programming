package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member member1 = new Member(101, "이순신");
		Member member2 = new Member(102, "김유신");
		Member member3 = new Member(103, "신사임당");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(102);
		System.out.println("-----------------");
		memberArrayList.showAll();
		
		memberArrayList.addMember(member2);
		System.out.println("-----------------");
		memberArrayList.showAll();
		
	}

}
