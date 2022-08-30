package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listt {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		List<Integer> list2 = new LinkedList<Integer>();
		
		list1.add("ももたかなこ");
		list1.add("たまいしおり");
		list1.add(1, "ささきあやか");
		list1.add("たかぎれに");
		
		System.out.println(list1);
		
		System.out.println(list1.get(2));
		
		System.out.println(list1.contains("たまいしおり"));
		System.out.println(list1.contains("ありやすももか"));
		
		System.out.println(list1.size());
		
		list2.add(3);
		
		
		System.out.println(list2);
	
	}
	
	
	

}
