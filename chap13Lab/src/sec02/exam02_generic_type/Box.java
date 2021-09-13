package sec02.exam02_generic_type;

/*
 * public class Box {

	//Box extends Object가 생략됨.//
	////클래스의 구성멤버
	//필드
	private Object object;

	//생성자
	//메소드
	public void set(Object object) {
		this.object = object;
		//필기 다 못함
	}

	public Object get() {
	return object;
	}
}
	 */
public class Box<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}
	
	
