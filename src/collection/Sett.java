package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sett {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		set1.add("オレンジノート");
		set1.add("コノウタ");
		
		System.out.println(set1);
		
		//要素の取得は拡張for文やラムダ式を用いて要素を取り出す
		
		System.out.println(set1.contains("コノウタ"));
		System.out.println(set1.contains("全力少女"));
		
		System.out.println(set1.size());
		
		//削除はListなどと同じくremoveメソッドを使用する
	}

}
