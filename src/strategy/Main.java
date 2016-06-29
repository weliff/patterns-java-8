package strategy;

import java.util.Arrays;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
		List<Item> itens = Arrays.asList(new Item(10),new Item(15),new Item(20));
		ShoppingCart cart = new ShoppingCart(itens);
		cart.pay(i -> System.out.println("Pay with credit " + i));
		cart.pay(i -> System.out.println("Pay with debit " + i));
		cart.pay(i -> System.out.println("Pay with money " + i));
		
		
	}
}
