package sec02.exam01_inHeritance;

public class DmbCellPhone extends CellPhone {
			//�ʵ�
			int channel;
			
			//������
			//��ü�� �����ϱ⵵ ������ �ڱ��ʵ� �ʱ�ȭ
			
			DmbCellPhone(String model, String color, int channel){
				this.model = model;
				this.color = color;
				this.channel = channel;
			}
			
			//�޼ҵ�
			void turnOnDmb() {
				System.out.println("ä�� "+channel+"�� Dmb ��� ������ �����մϴ�.");
			}
			
			void changeChannelDmb(int channel) {
				this.channel = channel;
				System.out.println("ä�� "+channel+"������ �ٲߴϴ�.");
			}

			void turnOffDmb() {
				System.out.println("Dmb ��� ������ ����ϴ�.");
			}
			
	
	
	
	
	
	
	
	
}
