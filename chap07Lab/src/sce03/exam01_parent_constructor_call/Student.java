package sce03.exam01_parent_constructor_call;

public class Student extends People {//부모클래스의 기본생성자가 없음
 
	public int studentNo;
           
	
 	Student(String name, String ssn, int student){
 		super(name ,ssn);//부모의 기본생성자가 없기때문에 에러가 나는중.
 		this.studentNo = student;
 	}
 	
	
	
}
