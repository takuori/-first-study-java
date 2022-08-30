package progate;

import java.util.Scanner;

public class java5Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		java4Person person1 = new java4Person("玉井", "詩織", 27, 1.591, 48.1, "医者");
		java4Person person2 = new java4Person("百田", "えくぼ", "夏菜子", 28, 1.581, 48.3, "教師");

		java5Bicycle bicycle = new java5Bicycle("しおりん", "黄色");

		System.out.println("【自転車の情報】");

		person1.buy(bicycle);
		bicycle.printData();

		System.out.println("----------------");
		System.out.println("【自転車の所有者の情報】");
		
		//getOwner()はPersonクラスのインスタンス
		//続けてPersonクラスのメソッドであるPrintDataメソッドを呼び出すことができる
		bicycle.getOwner().printData();
		
		System.out.println("----------------");
		System.out.print("走る距離を選択してください：");
		int bicycleDistance = scanner.nextInt();
		bicycle.run(bicycleDistance);

		System.out.println("================");

		java5Car car = new java5Car("フェラーリ", "赤");

		System.out.println("【車の情報】");

		person2.buy(car);
		car.printData();

		System.out.println("----------------");
		System.out.println("【車の所有者の情報】");
		
		//bicycleと同様
		car.getOwner().printData();

		System.out.println("----------------");
		System.out.print("走る距離を選択してください；");
		int carDistance = scanner.nextInt();
	    car.run(carDistance);
        
	    System.out.println("----------------");
		System.out.print("給油する量を入力してください；");
		int litre = scanner.nextInt();
		car.charge(litre);

	}

}
