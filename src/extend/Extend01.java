package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		//Humanクラスのインスタンスを生成
		Human sugimoto = new Human("杉本", 16);
		System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());
		
		//Studentクラスのインスタンスを生成
		Student sato = new Student("佐藤", 17, 70);
		//サブクラスのインスタンスからスーパークラス(Human)のメソッド呼び出し
		System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
		//Studentクラスで追加したメソッドを呼び出し
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します" + sato.getStudentProfile());
		
		//Employeeクラスのインスタンスを生成
		//アップキャストでHumanクラスの変数に代入
		Human human = new Employee("玉井", 27, "ももクロ");
		//スーパークラスのメソッドを呼び出し
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
		
		//Employeeクラスの変数にダウンキャスト
		Employee tanaka = (Employee) human;
		//Employeeクラスの変数なので、Employeeクラスに追加したメソッドの呼び出しができる
		System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());
		
		//printNmaeメソッドを呼ぼ出して名前を表示
		Extend01.printName(sugimoto);
		//Humanクラスのサブクラスの変数を引数にして呼び出し
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}
	
	//引数がHumanクラスなので、Humanクラスか、そのサブクラスなら呼び出しができる
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
	}

}
