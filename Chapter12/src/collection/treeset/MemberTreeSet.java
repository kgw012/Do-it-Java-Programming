package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet = new TreeSet<Member>(new Member());
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()){
			Member member = iterator.next();
			
			if(memberID == member.getMemberID()) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID+" ID를 가진 멤버가 없습니다.");
		return false;
	}
	
	public void showAll() {
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
		}
		
	}
}
