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
		//자동형변환 : int(4) <- byte(1) 작은값 => 큰값 자동변환
		//강제형변환 : byte(1) <- int(4) 큰값=>작은값 강제변환
		System.out.println("result2:"+result2);
		myCal.powerOff();
	
	
	}

}
