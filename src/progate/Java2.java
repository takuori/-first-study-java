package progate;

public class Java2 {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 6, 9, 13, 16};
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int number : numbers) {
			if (number % 2 == 0) {
				evenSum = evenSum + number;
			} else {
				oddSum = oddSum + number;
			}
		}
		System.out.println("奇数の和は" + oddSum + "です");
		System.out.println("偶数の和は" + evenSum + "です");
	}

}
