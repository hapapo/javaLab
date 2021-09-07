package sec07.exam04_other_constructor_call;

public class Car {
	
	// 구성멤버
	// 1. 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	// 2. 생성자
		Car(){
		
	}
	
	// 생성자 overloading
	// this : 자기 자신의 객체를 의미한다.
	// this() : 자기 자신의 객체의 다른 생성자를 의미한다.
	// super : 부모 객체 
	// super() : 부모 객체의 생성자
	Car(String model){
		this(model, null, 0);
		//this.model = model;
		
	}
	
	Car(String model,String color){
		this(model, color, 0);
		//this.model = model;
		//this.color = color;
		
	}
	
	Car(String model,String color,int maxSpeed){
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		}
}	//끝나고질문
	
	// 3. 메소드
	
	
 
	

