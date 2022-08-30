package progate;

public class java4Person {
	public static int count = 0;
	public static void pointCount() {
		System.out.println("合計" + java4Person.count + "人です！");
	}
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String job;
	private int age;
	private double height;
	private double weight;
	
	java4Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
		
		this(firstName, lastName, age, height, weight, job);
		this.middleName = middleName;
		
	}
	
	java4Person(String firstName, String lastName, int age, double height, double weight, String job) {
		java4Person.count++;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    this.job = job;
	}
	
	public String fullName() {
		if (middleName == null) {
			return this.firstName + " " + this.lastName;
		} else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
		
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
		System.out.println("仕事は" + this.job + "です");
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;	
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void buy(java5Vehicle vehicle) {
		
		//thisはbuyメソッドを呼び出しているPersonクラスのインスタンスを指す
		//クラスごとに同じようなコードを書くので一つにまとめる
		//Carクラス、Bicycleクラスのインスタンス共に、Vehicle型でもある
		//サブクラスのインスタンスをスーパークラスのクラス型変数に代入可能なこと（多態姓）
		vehicle.setOwner(this);
	}
	

}
