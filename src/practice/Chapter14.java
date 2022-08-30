package practice;

import java.util.ArrayList;
import java.util.List;

public class Chapter14 {
	public static void main(String[] args) {
		//List型の変数「party]を生成
		List<Character> party = new ArrayList<Character>();
		
		//partyに戦士と遊び人を追加
		party.add(new Soldier());
		party.add(new Playboy());
		party.add(new Superman());
		
		Chapter14.partyAttack(party);
	}
	
	public static void partyAttack(List<Character> party) {
		
		//拡張forループ
		//partyの要素を「Character character」変数に代入することで
		//character.attackだが、実体は[Soldier]のインスタンスと[Playboy]のインスタンスなので各処理が実行される
		for (Character character : party) {
			int hp = character.attack();
			System.out.println("ヒットポイント：" + hp);
		}
		//Characterインターフェースを実装しているので、他に魔法使いなどを追加する場合も
		//partyAttackメソッドはj変更せず、party変数に追加するだけで済む
		//ポリモーフィズム
	}

}
