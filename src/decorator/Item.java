package decorator;

import java.util.function.Function;
import java.util.stream.Stream;

public class Item {
	
	private Function<Integer, Integer>[] itemExtras = new Function[]{};
	
	private int price;
	
	public Item(int price) {
		this.price = price;
	}
	public Item(int price, Function<Integer, Integer>... itemExtras) {
		this.price = price;
		this.itemExtras = itemExtras;
	}
	
	public int getPrice() {
		Function<Integer, Integer> itemExtras = Stream.of(this.itemExtras).reduce(Function.identity(), Function::andThen);
//		Function<Integer, Integer> itemExtras = Stream.of(this.itemExtras).reduce(Function.identity(), (a, b) -> a.andThen(b));
		return itemExtras.apply(price);
	}
}
