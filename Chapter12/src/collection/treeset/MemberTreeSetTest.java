package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member member1 = new Member(102, "ÀÌ¼ø½Å");
		Member member2 = new Member(101, "±èÀ¯½Å");
		Member member3 = new Member(103, "½Å»çÀÓ´ç");

		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);
		
		memberTreeSet.showAll();
		
		System.out.println("---------------");
		Member member4 = new Member(101, "ÀÌ¸ù·æ");
		memberTreeSet.addMember(member4);
		memberTreeSet.showAll();
	}

}
