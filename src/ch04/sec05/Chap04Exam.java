package ch04.sec05;

public class Chap04Exam {
	public static void main(String[] args) {
		int num1,num2,sum;
		do {
			num1 = (int)Math.random()*6+1;
			num2 = (int)Math.random()*6+1;
			sum = num1+num2;
			System.out.printf("(%d,%d)",num1,num2);
		}while(sum!=5);
	}
}
