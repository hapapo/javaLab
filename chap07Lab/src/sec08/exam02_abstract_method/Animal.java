package sec08.exam02_abstract_method;

public abstract class Animal {
	//추상클래스의 구성멤버
	//필드
	public String kind;
	
	//생성자
	
	//일반메소드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드
	public abstract void sound();//{}가 없음.
	
	
}
