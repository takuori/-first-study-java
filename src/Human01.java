
public class Human01 { 
	//アクセス修飾子publicでどこからでもアクセスできるクラスHuman01を定義
	
	public String name;
	public int age;
	//アクセス修飾子publicでどこからでもアクセスできるメンバ変数nameとageを定義
	//メンバ変数とは、クラスの直下に書かれた変数
	
	public Human01() {
		name = "佐藤";
		age = 20;
	}
	//引数なしのコンストラクタを定義
	//これを用いて初期化した場合はここに定義した値で初期化される。
	
	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//引数2つ(String型とint型)のコンストラクタを定義
	//これを用いて初期化した場合は引数として渡した値で初期化される
	//初期化対象は生成したインスタンスのメンバ変数なので、thisを用いて指定

}
