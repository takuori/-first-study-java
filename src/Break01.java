
public class Break01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				break;
			}
			System.out.println("break = " + count);
		}
		
		for (int coun = 0; coun < 5; coun++) {
			if (coun == 2) {
				continue;
			}
			System.out.println("continue = " + coun);
		}
	}

}
