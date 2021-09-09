package sec07.exam07_instanceof;

public class InstanceofExample {

	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent; //강제형변환
			System.out.println("method1-Child로 변환 성공");
			}
		else {
			System.out.println("method1-Child로 변환되지 않음");
		}
		
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2-Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();//자동형변환
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); //예외 발생 -> 비정상으로 종료
		
		
		
		
		
		
		
		
	}

}
