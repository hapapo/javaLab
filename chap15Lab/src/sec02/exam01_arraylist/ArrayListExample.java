package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Java");    //0
		list.add("JDBC");     //1
		list.add("Servlet/JSP");  //2->3 ->2
		list.add(2, "Database");   //2 ->x
		list.add("iBatis");    //4 ->3->2->x
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö:"+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2:"+skill);
		System.out.println();

		
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
					 System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
					 System.out.println(i+":"+str);
		}
		
	}

}
