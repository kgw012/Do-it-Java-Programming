package practice.arraylist;

import java.util.ArrayList;

import practice.Member;

public class MemberArrayList {
	
	private ArrayList<Member> memberArr = new ArrayList<>();
	
	//add member
	public void addMember(Member member) {
		memberArr.add(member);
	}
	public void addMemberIndex(int index, Member member) {
		memberArr.add(index, member);
	}
	
	//remove member
	public boolean removeMember(int memberID) {
		for(int i=0; i<memberArr.size(); i++) {
			Member member = memberArr.get(i);
			if(memberID == member.getMemberID()) {
				memberArr.remove(i);
				return true;
			}
		}
		System.out.println(memberID + " ID가 존재하지 않습니다.");
		return false;
	}
	
	//show information
	public void showInfo() {
		System.out.println(memberArr);
	}
}
