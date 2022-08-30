package generics;

import java.math.BigDecimal;

public class Peach extends Fruit {
	Peach(String name, BigDecimal price) {
		super(name, price);
	}
	
	protected String getName() {
		return name;
	}
	
	protected BigDecimal getPrice() {
		return price;
	}

}
