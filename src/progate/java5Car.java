package progate;

public class java5Car extends java5Vehicle {
	//名前、色、距離に関するフィールド、メソッドはVehicleのサブクラスとして
	//継承されている
    
	//carクラス独自のフィールド
	private int fuel = 150;
	
	//サブクラスコンストラクタ定義
	//super()でスーパークラスのコンストラクタを呼び出している
	//よってサブクラスのインスタンス生成時に、スーパークラスのコンストラクタが呼び出されている
	java5Car(String name, String color) {
		super(name, color);
	}

	public int getFuel() {
		return this.fuel;
	}
	
	//スーパークラスから継承しているメソッドの処理を、特定のサブクラスでカスタマイズ
	//スーパークラスと同名のメソッドを定義することでスーパークラスの内容を上書き
	//「オーバーライド」
	public void printData() {
		
		//名前、色、走行距離に関してスーパークラスとコードが重複
		//superを用いて、スーパークラスのインスタンスメソッドを呼んでいる
		super.printData();
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
	
	public void run(int distance) {
	    System.out.println(distance + "km走ります");
	    if (distance <= this.fuel) {
	      this.distance += distance;
	      this.fuel -= distance;
	    } else {
	      System.out.println("ガソリンが足りません");
	    }
	    System.out.println("走行距離：" + this.distance + "km");
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }

    //carクラス独自のメソッドを定義
	public void charge(int litre) {
		if (litre <= 0) {
			System.out.println("給油できません");
		} else if (litre + this.fuel >= 100) {
			System.out.println("満タンまで給油します");
			this.fuel = 150;
		} else {
			System.out.println(litre + "L給油します");
			this.fuel += litre;
		}
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
	
	
}
