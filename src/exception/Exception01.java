package exception;

public class Exception01 {
	public static void main(String[] args) {
		System.out.println("100 ÷ 0 は？");
		int result = 100 / 0;
		//0で割り算しているため例外発生
		
		System.out.println("計算結果" + result);
		System.out.println("プログラム終了");
		//例外が発生した移行の処理は行われない
	}

}
