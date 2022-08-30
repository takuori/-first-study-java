package practice;

public class Soldier implements Character {
	
	//インターフェースのattackメソッドをSoldier用にオーバーライドする
	public int attack() {
		System.out.println("戦士の会心の一撃！");
		return 100;
	}

}
