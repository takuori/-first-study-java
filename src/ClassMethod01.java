
public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 satou = new Human01();
		System.out.println("名前は" + satou.name + "で、年齢は" + satou.age + "です。");
		
		Human01 minion = new Human01("ミニオン", 5);
		System.out.println("名前は" + minion.name + "で、年齢は" + minion.age + "です。");
	}

}
