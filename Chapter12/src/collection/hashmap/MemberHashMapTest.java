package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap= new MemberHashMap();

		Member member1 = new Member(102, "이순신");
		Member member2 = new Member(101, "김유신");
		Member member3 = new Member(104, "신사임당");
		Member member4 = new Member(103, "신사임");

		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		
		memberHashMap.showAllMember();
		
		System.out.println("---------------");
		Member member5 = new Member(101, "이몽룡");
		memberHashMap.addMember(member5);
		memberHashMap.showAllMember();
	}

}
