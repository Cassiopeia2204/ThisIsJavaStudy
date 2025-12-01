package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("GalaxyS24", "navy"); 
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		myPhone.setWifi(false);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.recieveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hangUp();
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
