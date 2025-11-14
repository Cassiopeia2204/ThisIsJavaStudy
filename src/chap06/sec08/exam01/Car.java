package chap06.sec08.exam01;

public class Car {
	
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run(int speed) {
		setSpeed(speed); //run()에서는 this 생략가능
		System.out.println(model+"가 달립니다. (시속: "+ speed+"km/h");
	}

}
