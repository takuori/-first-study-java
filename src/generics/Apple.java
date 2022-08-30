package generics;

import java.math.BigDecimal;

public class Apple extends Fruit{
	
	Apple(String name, BigDecimal price) {
		super(name, price);
	}
	
	protected String getName() {
		return name;
	}
	
	protected BigDecimal getPrice() {
		return price;
	}

}
