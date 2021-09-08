package sec13.exam02_constructor_access.package1;

public class B {
	//필드
	//A a1 = new A(true);
	//A a2 = new A(1);
	//A a3 = new A("문자열");//the constructor A(String) is not visible
	public B() {
	A a = new A();
	a.field1 = 1; // (O) 
	a.field2 = 1; // (O)
	a.field3 = 1; // (X) 
	a.method1(); // (O)
	a.method2(); // (O)
	a.method3(); // (X)
	}
}
