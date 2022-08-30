package practice;

public class Playboy implements Character {
	
	//インターフェースのattackメソッドをPlayboy用にオーバーライドする
	public int attack() {
		System.out.println("遊び人は、ただ遊んでいるだけだった");
		return 0;
	}

}
