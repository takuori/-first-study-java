package collection;

import java.util.HashMap;
import java.util.Map;

public class MapFor {
	public static void main(String[] args) {
		Map<Integer, String> classmates = new HashMap<>();
		
		classmates.put(1, "百田");
		classmates.put(2, "玉井");
		classmates.put(3, "佐々木");
		
		for (Integer key : classmates.keySet()) {
			System.out.println(key);
		}
		
		for (String name : classmates.values()) {
			System.out.println(name);
		}
		
		for (Map.Entry<Integer, String> classmate : classmates.entrySet()) {
			System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん");
		}
	}

}
