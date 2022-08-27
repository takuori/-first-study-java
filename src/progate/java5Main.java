package progate;

import java.util.Scanner;

public class java5Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		java5Bicycle bicycle = new java5Bicycle("ビアンキ", "黄");
		System.out.println("【自転車の情報】");
		
		bicycle.printData();
		
		System.out.println("---------------");
		System.out.print("走る距離を入力してください：");
		int bicycleDistance = scanner.nextInt();
		bicycle.run(bicycleDistance);
		
		System.out.println("================");
		
		java5Car car = new java5Car("フェラーリ", "赤");
        System.out.println("【車の情報】");
		
		car.printData();
		
		System.out.println("---------------");
		System.out.print("走る距離を入力してください：");
		int carDistance = scanner.nextInt();
		car.run(carDistance);
		
		System.out.println("---------------");
		System.out.print("給油する量を入力してください：");
		int addFuel = scanner.nextInt();
		
		car.charge(addFuel);
	}
	

}
