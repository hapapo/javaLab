package sec08.exam03_method_call;

public class Calculator {
	//구성멤버
	//1.필드
	//2.생성자
	//3.메소드
	int plus(int x,int y) {
		int result = x+y ;
		return result;
	}
	
	double avg(int x,int y) {
		double sum = plus(x,y);//자동형변환 : double(8)<=int(4)
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과:"+result);
	}
	void println(String message) {
		System.out.println(message);
	}
	
	
}//class
