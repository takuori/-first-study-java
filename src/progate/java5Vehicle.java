package progate;

//runメソッドという抽象メソッドを持つため、クラスも抽象クラスにする必要あり
abstract class java5Vehicle {
	
	//名前、色、距離に関してのフィールドとメソッドがcarクラスとbicycleクラスで重複
	//故にスーパークラスとしてVehicleを設定
	
	private String name;
	private String color;
	
	//各サブクラスのrunメソッドでditanceの値にアクセスできるようにprotected
	//protectedとすることでこのクラスとサブクラスからのみアクセスが許される
    protected int distance = 0;
    
    //クラス型の変数を定義することで、フィールドにインスタンスを持つことができる
    private java4Person owner;
    
    //スーパークラスのコンストラクタを定義
    //nameとcolorの値をセットできるようにする
    java5Vehicle(String name, String color) {
    	this.name = name;
    	this.color = color;
    }
	
    public String getName() {
        return this.name;
    }

	public String getColor() {
		return this.color;
	}

	public int getDistance() {
		return this.distance;
	}
	
	//戻り値はクラス型
	//この戻り値はownerフィールドの値　＝　Personクラスのインスタンス
	public java4Person getOwner() {
		return this.owner;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setOwner(java4Person person) {
		this.owner = person;
	}

	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
	}
	
	//サブクラスは必ずrunメソッドを定義しなければならないようにしている
	//runメソッドはサブクラスによって内容が違ってくるのでスーパークラスから継承は厳しい
	//詳細未定、故にサブクラスで詳細が決まる（オーバーライド強制）
	public abstract void run(int distance);

}
