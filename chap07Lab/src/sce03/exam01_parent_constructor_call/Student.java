package sce03.exam01_parent_constructor_call;

public class Student extends People {//�θ�Ŭ������ �⺻�����ڰ� ����
 
	public int studentNo;
           
	
 	Student(String name, String ssn, int student){
 		super(name ,ssn);//�θ��� �⺻�����ڰ� ���⶧���� ������ ������.
 		this.studentNo = student;
 	}
 	
	
	
}
