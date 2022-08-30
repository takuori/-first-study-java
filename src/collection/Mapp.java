package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapp {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();
		
		map1.put(0,  "ぶどう");
		map1.put(3, "もも");
		
		//登録済みのキーを追加すると上書きされる
		map1.put(0, "マスカット");
		
		System.out.println(map1);
		
		System.out.println(map1.get(0));
		System.out.println(map1.get(1)); //null
		
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ぶどう"));
		
		System.out.println(map1.size());
		
		System.out.println(map1.remove(1)); //何もしない
		//キーを指定して要素を削除するか、
		//キーと値両方を指定して要素を削除することができる
	}

}
