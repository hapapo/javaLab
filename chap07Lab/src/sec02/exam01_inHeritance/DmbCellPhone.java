package sec02.exam01_inHeritance;

public class DmbCellPhone extends CellPhone {
			//필드
			int channel;
			
			//생성자
			//객체를 생성하기도 하지만 자기필드 초기화
			
			DmbCellPhone(String model, String color, int channel){
				this.model = model;
				this.color = color;
				this.channel = channel;
			}
			
			//메소드
			void turnOnDmb() {
				System.out.println("채널 "+channel+"번 Dmb 방송 수신을 시작합니다.");
			}
			
			void changeChannelDmb(int channel) {
				this.channel = channel;
				System.out.println("채널 "+channel+"번으로 바꿉니다.");
			}

			void turnOffDmb() {
				System.out.println("Dmb 방송 수신을 멈춥니다.");
			}
			
	
	
	
	
	
	
	
	
}
