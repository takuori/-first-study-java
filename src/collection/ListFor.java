package collection;

import java.util.ArrayList;
import java.util.List;

public class ListFor {
	public static void main(String[] args) {
		List<String> prefectures = new ArrayList<>();
		
		prefectures.add("北海道");
		prefectures.add("沖縄県");
		prefectures.add("京都府");
		
		for( String prefecture : prefectures ) {
			System.out.println(prefecture);
		}
	}

}
