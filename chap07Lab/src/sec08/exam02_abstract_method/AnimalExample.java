package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("==========");
		
		// 변수의 자동 타입 변환
		Animal animal = null;//추상 클래스는 객체생성 불필요 클래스타입 변수에 null로 사용
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		
		
		
		
	}

}
