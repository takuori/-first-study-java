package practice;

public class EnumFruit {
	public static void main(String[] args) {
		Fruit fruit = Fruit.APPLE;

		System.out.println(fruit.getName());
		System.out.println(Fruit.PEACH.getId());

		System.out.println(fruit.toString());

		Fruit fruit2 = Fruit.valueOf("PEACH");
		System.out.println(fruit2.getName());

		for (Fruit fruit3 : Fruit.values()) {
			System.out.println(fruit3.getName());
		}

		switch (fruit) {
		case ORANGE:
			System.out.println("おいしいみかん！");
			break;
		case APPLE:
			System.out.println("りんご高級");
			break;
		case PEACH:
			System.out.println("ももクロChan");
			break;
		}
	}

}
