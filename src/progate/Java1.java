package progate;

public class Java1 {
	public static void main(String[] args) {
		String name = "玉井詩織";
		int age = 27;
		double height = 1.654;
		double weight = 48.1;
		double bmi = weight / height / height;
		
		System.out.println("名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "mです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("BMIは" + bmi + "です");
	}
}
