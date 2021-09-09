package sec05.exam02_final_method;

public class Car {
	//필드
	public int speed;
	//메소드
	public void speedUp() {
		speed +=1;
	}
	//파이널 메소드
	public void stop() {
		System.out.println("차를 정지합니다.");
		speed = 0; 
	}
	
	
	

}
