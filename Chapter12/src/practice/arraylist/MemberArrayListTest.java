package practice.arraylist;

import practice.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArr = new MemberArrayList();
		
		Member member1 = new Member(10001, "����");
		Member member2 = new Member(10002, "��浿");
		Member member3 = new Member(10003, "��漱");
		
		memberArr.addMember(member1);
		memberArr.addMember(member2);
		memberArr.addMember(member3);
		
		memberArr.showInfo();
		memberArr.removeMember(10002);
		memberArr.showInfo();
		
		memberArr.addMemberIndex(1, member2);
		memberArr.showInfo();
	}

}
