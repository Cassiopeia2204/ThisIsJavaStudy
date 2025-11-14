package ch02.sec12;

public class test03 {

	public static void main(String[] args) {
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(z);
		
//		int score = 85;
//		String result = (!(score>90)) ? "가" : "나";
//		System.out.println(result);
		
//		int pencils = 534;
//		int students = 30;
//		int pencilPerStudents = pencils / students;
//		System.out.println(pencilPerStudents);
//		
//		int pencilsLeft= pencils % students;
//		System.out.println(pencilsLeft);
		
//		int value = 356;
//		System.out.println((value/100)*100);
		
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = (double)(lengthTop + lengthBottom) * height / 2;
//		System.out.println(area);
		
//		int x = 10;
//		int y = 5;
//		
//		System.out.println((x>7)&&(y<=5));
//		System.out.println((x%3==2)||(y%2!=1));
		
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
	}

}
