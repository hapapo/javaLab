package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1=myCal.areaRectangle(10);
		System.out.println("정사각형의 넓이="+result1);
		
		//직사각형의 넓이 구하기
		double result2=myCal.areaRectangle(10, 15);
				
		System.out.println("직사각형의 넓이="+result2);		
		
		
		
		
		
	}

}
