package ch06.exam;

public class MemberService {

	Member member = new Member("hong","12345");
	
	public boolean login(String id, String password) {
		if(member.id == id && member.password == password) {
			return true;
		}else {
			return false;
		}
	}
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
