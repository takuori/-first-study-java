package practice;

public class Chapter09 {
	public static void main(String[] args) {
		double fuelCost = 12.5;
		double fuelAmount = 55.0;
		
		Car car = new Car(fuelCost, fuelAmount);
		//Car.javaで定義した引数2つのコンストラクトを使用してCarクラスのインスタンスを生成
		
		car.move(20);
		System.out.println("残量は、" + car.getFuelAmount() + "です");
		//定義したmoveメソッドを実行し、期待する実行結果を出力する
		//getFuelAmountは定義済みで、引っ張ってきている
	}

}
