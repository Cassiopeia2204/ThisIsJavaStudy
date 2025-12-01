package ch07.sec02;

public class Phone {
	
	String model;
	String color;
	
	public void bell() {
		System.out.println("벨이 올립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("나: " + message);
	}
	
	public void recieveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
