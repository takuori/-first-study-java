package capsule.human;

public class HumanCapsule {
	private String name;
	private int age;
	//外部から隠蔽されてる
	//他のプログラムによる直接の変更を禁止している
	
	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//フィールドにアクセス制限すると、値の取得もできなくなる
	//そのため、以下のようにフィールドの値を必要に応じてメソッドを作成して他のプログラムから参照できるようにしている
	public String getName() {
		return this.name;
	} //getterメソッド フィールドの値を取得するためのもの
	
	public void setName(String name) {
		this.name = name;
	} //setterメソッド フィールドの値を変更するためのもの
	
	public int getAge() {
		return this.age;
	} //ageは外部から変更禁止のためsetterメソッドは作成しない

}
