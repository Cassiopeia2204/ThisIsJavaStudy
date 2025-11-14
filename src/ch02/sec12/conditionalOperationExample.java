package ch02.sec12;

public class conditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(score + "은 " + grade + "입니다." );

	}

}
