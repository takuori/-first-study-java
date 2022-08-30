package practice;

public enum Fruit {
	
	APPLE("りんご", 1),
	ORANGE("オレンジ", 2),
	PEACH("もも", 3);
	
	//フィールドの定義ができる
	private String name;
	private int id;
	
	//コンストラクタの定義ができる
	private Fruit(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//メソッドを定義できる
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

}
