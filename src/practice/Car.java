package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	//アクセス修飾子privateでメンバ変数が定義されている
	//このクラスの中でしか値を格納したり取り出したりということができない
	//メンバ変数　＝　フィールド
	
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	//引数2つ(double型の2つ)のコンストラクタを定義
	//これを用いて初期化した場合は引数として渡した値で初期化される
	
	public void move(int km) {
		System.out.println(km + "km走ります");
		this.fuelAmount -= (km / fuelCost);
	}
	//moveメソッドを定義
	//いくら走るのか文字列を出力
	//残量を計算
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
	//fuelAmountを取得するメソッドを作成

}
