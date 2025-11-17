package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 99;
		a.field2 = 100;
//		a.field3 = 101;   The field A.field3 is not visible
		
		a.method1();
		a.method2();
//		a.method3();   The method method3() from the type A is not visible
	}
}
