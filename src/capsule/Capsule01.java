package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
	public static void main(String[] args) {
		HumanNoCapsule human1 = new HumanNoCapsule("田中", 28);
		//名前や年齢が変更禁止のカプセル化されていないインスタンスを生成
		
		human1.name = "今田";
		human1.age = 70;
		//変更できてしまうので、想定外の名前と年齢になってしまう
		
		System.out.println("名前は" + human1.name + "、年齢は" + human1.age + "です");
		
		HumanCapsule human2 = new HumanCapsule("小林", 32);
		//名前や年齢が変更禁止のカプセル化されたインスタンスを生成
		human1.name = "今田";
		human1.age = 70;
		
		System.out.println("名前は" + human2.getName() + "、年齢は" + human2.getAge() + "です");
		//直接変更されないため、想定通りの名前と年齢が取得できる
		human2.setName("佐々木");
		System.out.println("変更した名前は"  + human2.getName() + "です");
	}

}
