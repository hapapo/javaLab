package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		myCal.powerOn();
		
		int result1 = myCal.plus(5,6);
		System.out.println("result1:"+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCal.divide(x, y); 
		//�ڵ�����ȯ : int(4) <- byte(1) ������ => ū�� �ڵ���ȯ
		//��������ȯ : byte(1) <- int(4) ū��=>������ ������ȯ
		System.out.println("result2:"+result2);
		myCal.powerOff();
	
	
	}

}
