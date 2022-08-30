package RamudaStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));
		
		//ラムダ式未使用↓

		//10個以下に絞り込まれたリストの作成
		List<Fruit> filtered = new ArrayList<>();

		for (Fruit fruit : fruits) {
			if (fruit.getQuantity() <= 10) {
				//if文で10個以下に搾られたfruitを作成したリストに追加
				filtered.add(fruit);
			}
		}

		//20個ずつ追加する
		List<Fruit> ordered = new ArrayList<>();

		//10個以下に絞り込まれたリストの要素をfruit変数に代入
		for (Fruit fruit : filtered) {
			//fruitに代入された各要素にオーダーメソッドを呼び出し、20個追加する
			ordered.add(fruit.order(20));
		}

		//個数が少ない順に並び替える
		ordered.sort(new Comparator<Fruit>() {
			public int compare(Fruit f1, Fruit f2) {
				return f1.getQuantity() - f2.getQuantity();
			}
		});

		for (Fruit fruit : ordered) {
			System.out.println(fruit);
		}
		
		//ラムダ式使用↓

		fruits.stream()//ストリームの生成　コレクションに対しstreamメソッドを呼ぶ
	            //中間操作１：個数が10個以下のものを抽出
				.filter(f -> f.getQuantity() <= 10)
				
				//中間操作２：20個ずつ発注
				.map(f -> f.order(20))
				
				//中間操作３：個数の少ない順に並び替え
				.sorted((f1, f2) -> f1.getQuantity() - f2.getQuantity())
				
				//終端操作：標準出力
				.forEach(System.out::println);
	}

}
