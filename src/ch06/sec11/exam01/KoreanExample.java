package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "김자바");
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.snn);
		
//		k1.nation = "usa";
//		k1.snn = "1234677-6785674";
		
		k1.name = "이자바";
	}

}
