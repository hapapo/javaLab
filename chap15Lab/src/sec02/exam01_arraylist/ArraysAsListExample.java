package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("ȫ�浿", "�ſ��","���ڹ�");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2= Arrays.asList(1,2,3);  //���� ����ִ°� �ƴ�. 1,2,3�� �����ִ� integer�ּҰ��� �����Ѵ�.
		for(int value : list2) {
			System.out.println(value);
			
		}
		
		
	}

}
