package sec02.exam01_inHeritance;

public class CellPhone {
		//구성멤버
		//필드
		String model;
		String color;//객체를 만들면 인스턴스 멤버가 됨.
		
		
		//생성자
		
		
		//메소드(소문자)
		void powerOn() {
			System.out.println("전원을 켭니다.");
		}
		
		void powerOff() {
			System.out.println("전원을 끕니다.");
		}
		
		void bell() {
			System.out.println("벨이 울립니다.");
		}
		
		void sendVoice(String message) {//안에서 변수선언
			System.out.println("자기: "+message);
		}
		
		void receiveVoice(String message) {
			System.out.println("상대방: "+message);
		}
		
		void hangUp() {
			System.out.println("전화를 끊습니다.");
		}
		
		
		
		
		
		
		
		
}
