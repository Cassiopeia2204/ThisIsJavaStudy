package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	
	public C() {
		A a = new A();
		
		a.field1 = 98;
//		a.field2 = 777; The field A.field2 is not visible
//		a.field3 = 273;   The field A.field3 is not visible
//		a.field4 = "너는 할 수 없어.";  The field A.field4 is not visible
		a.field5 = "너는 더 위대한 사람이 될 수 있어!";
		
		a.method1();
//		a.method2();  The method method2() from the type A is not visible
//		a.method3();  The method method3() from the type A is not visible
	}

}
