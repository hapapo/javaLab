package sec09.exam01_instance_member;

public class Car {
	//Ŭ���� �������
	//�ν��Ͻ� �ʵ�
	String model;
	int speed;
	
	//������ �����ε�
	Car(){}
	//�⺻������ �� �ٸ������� �߰��Ұ�� �⺻������ �ݵ�� �����Ұ�
	Car(String model){
		this.model = model;
	}
	
	//�ν��Ͻ� �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
		
		
	}
	void run() {
		for(int i=10; i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"�� �޸��ϴ�.(�ü�:"+this.speed+"km/h");
		}
	}
	
	
	
}
