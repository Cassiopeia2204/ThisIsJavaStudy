package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
//		Calculator myCal = new Calculator();
//		double CircleArea = 10 * 10 * myCal.pi;
//		int sum = myCal.plus(1234453, 683631);
//		int sub = myCal.minus(54362, 5636);
		double CircleArea = 10 * 10 * Calculator.pi;
		int sum = Calculator.plus(1234453, 683631);
		int sub = Calculator.minus(54362, 5636);
		
		System.out.println("원의 넓이: " + CircleArea);
		System.out.println("합계 : "+ sum);
		System.out.println("차 : "+ sub);

	}

}
