
public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 s = new Human01();
		//引数なしのコンストラクタを用いてHuman01クラスのインスタンスを生成
		
		System.out.println("名前は" + s.name + "で、年齢は" + s.age + "です。");
		//上記インスタンスのnameとageを表示すると、コンストラクタで代入した初期値が表示される
		
		Human01 minion = new Human01("ミニオン", 5);
		//引数2つのコンストラクタを用いてHUman01クラスのインスタンスを生成
		
		System.out.println("名前は" + minion.name + "で、年齢は" + minion.age + "です。");
		//上記インスタンスのnameとageを表示すると、コンストラクタの引数に渡した値が表示される
	}

}
