package chap7_example1;

public class Child02 extends Parent02 {
	
	private String name;
	public Child02() {
	this("ȫ�浿");
	System.out.println("Child() call");
	}
	public Child02(String name) {
	this.name = name;
	System.out.println("Child(String name) call");
	}

}
