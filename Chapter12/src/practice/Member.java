package practice;

public class Member {
	private int memberID;
	private String memberName;
	
	//생성자
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	public Member() {}

	//getset메서드
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//toString 오버라이드
	@Override
	public String toString() {
		return memberName+"("+memberID+")";
	}
}
