package sec09.exam01_instance_member;

public class Car {
	//클래스 구성멤버
	//인스턴스 필드
	String model;
	int speed;
	
	//생성자 오버로딩
	Car(){}
	//기본생성자 외 다른생성자 추가할경우 기본생성자 반드시 생성할것
	Car(String model){
		this.model = model;
	}
	
	//인스턴스 메소드
	void setSpeed(int speed) {
		this.speed = speed;
		
		
	}
	void run() {
		for(int i=10; i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h");
		}
	}
	
	
	
}
