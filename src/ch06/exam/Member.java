package ch06.exam;


//확인문제 #12
public class Member {
	public String name;
	public String id;
	public String password;
	public int age;
	
	public Member() {
		
	}
	
	public Member( String id, String password) {
		this.password = password;
		this.id = id;
	}

}
