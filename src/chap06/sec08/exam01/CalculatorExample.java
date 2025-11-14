package chap06.sec08.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.powerOn();
		int r1 = calc.plus(596729, 7987489);
		System.out.println("plus 매소드 리턴값: "+ r1);
		double r2 = calc.divide(7879879, 45432);
		System.out.println("divide 메소드 리턴값: "+ r2);
		calc.powerOff();
	}
}