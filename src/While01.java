
public class While01 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While = " + number);
		}
		
		int num = 100;
		do {
			num *= 2;
			System.out.println("do = " + num);
		} while (num < 50);
		
		for ( int numb = 1; numb <= 5; numb++) {
			System.out.println("for = " + numb);
		}
		
		int [] array = { 1, 2, 3, 4, 5 };
		for (int numbe : array) {
			System.out.println("for01 = " + numbe);
		}
	}
	

}
