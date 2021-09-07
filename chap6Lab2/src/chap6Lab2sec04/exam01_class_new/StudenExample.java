package chap6Lab2sec04.exam01_class_new;

//실행용 클래스(메인메소드 있음)
public class StudenExample {

	public static void main(String[] args) {
	
		// Student 객체를 만들어 생성된 객체의 주소값을 s1 변수에 저장한다.
		// s1은 Student 객체를 참조하니까 s1은 생성된 Student 객체를 지칭한다.
		Student s1 = new Student();
		//객체는 단순변수가 아니기때문에 그 객체의 메소드 사용가능
		System.out.println("s1변수가 Student 객체를 참조합니다.");
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student객체를 참조합니다.");
		//객체를 통해 데이터를 따로따로 보관하기위해 표시
		// Title "작품"
		
		
		

	}

}
