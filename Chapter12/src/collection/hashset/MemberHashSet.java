package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet = new HashSet<>();
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			Member member = iterator.next();
			
			if(memberID == member.getMemberID()) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID+" ID를 가진 멤버가 없습니다.");
		return false;
	}
	
	public void showAll() {
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
		}
		
	}
}
