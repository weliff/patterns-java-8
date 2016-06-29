package strategy;

import java.util.List;
import java.util.function.Consumer;

public class ShoppingCart {
	
	private List<Item> itens;
	
	public ShoppingCart(List<Item> itens) {
		this.itens = itens;
	
	}
	
	public void pay(Consumer<Integer> method) {
		int total = cartTotal();
		method.accept(total);
	}
	
	public int cartTotal(){
		return itens.stream().mapToInt(Item::getPrice).sum();
	}
}
