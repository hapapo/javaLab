package sec08.exam01_abstract_class;

public class Phone {
	// �߻� Ŭ������ �������
	// �ʵ�
	public String owner;
	
	// ������
	public Phone(String owner) {
		this.owner = owner;
		
	}
	// �߻�޼ҵ�
	// �Ϲݸ޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
	
	
	
}