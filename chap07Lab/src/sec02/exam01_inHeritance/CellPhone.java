package sec02.exam01_inHeritance;

public class CellPhone {
		//�������
		//�ʵ�
		String model;
		String color;//��ü�� ����� �ν��Ͻ� ����� ��.
		
		
		//������
		
		
		//�޼ҵ�(�ҹ���)
		void powerOn() {
			System.out.println("������ �մϴ�.");
		}
		
		void powerOff() {
			System.out.println("������ ���ϴ�.");
		}
		
		void bell() {
			System.out.println("���� �︳�ϴ�.");
		}
		
		void sendVoice(String message) {//�ȿ��� ��������
			System.out.println("�ڱ�: "+message);
		}
		
		void receiveVoice(String message) {
			System.out.println("����: "+message);
		}
		
		void hangUp() {
			System.out.println("��ȭ�� �����ϴ�.");
		}
		
		
		
		
		
		
		
		
}
