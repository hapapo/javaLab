package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("홍길동", "신용권","감자바");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2= Arrays.asList(1,2,3);  //값이 들어있는게 아님. 1,2,3이 갖고있는 integer주소값을 참조한다.
		for(int value : list2) {
			System.out.println(value);
			
		}
		
		
	}

}
