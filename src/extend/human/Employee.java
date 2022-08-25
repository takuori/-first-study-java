package extend.human;

//Humanクラスを継承
public class Employee extends Human {
	
	//サブクラスで追加したフィールド
	private String department;
	
	public Employee(String name, int age, String department) {
		super(name, age); //スーパークラスのコンストラクタを呼び出し
		this.department = department;
	}
	
	//サブクラスで追加したメソッド
	public String getEmployeeProfile() {
		
		//親インスタンスのフィールドをthis変数で参照(suoerでも可)
		String profile = "年齢は" + this.age + "です";
		profile += "サラリーマンで、部署は" + this.department + "です";
		return profile;
	}

}
