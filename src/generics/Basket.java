package generics;

import java.math.BigDecimal;

public class Basket<E extends Fruit> {
	private E elem;
	private final BigDecimal PRICE = new BigDecimal(100);
	
	Basket(E e) {
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
	
	void printName() {
		System.out.println("かごの中身は" + elem.getName() + "です");
	}
	
	void printTotalPrice() {
		BigDecimal totalPrice = PRICE.add(elem.getPrice());
		System.out.println(elem.getName() + "の入った籠は合計" + totalPrice + "円です");
	}
	
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));
		
		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();

	}

}
