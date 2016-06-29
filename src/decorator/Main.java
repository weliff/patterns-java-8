package decorator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

	
	public static void main(String[] args) {
		
		Function<Integer, Integer> giftPacking = value -> {return value + 20;};
		Function<Integer, Integer> intTaxes = value -> value + 15;
		
		Item item2 = new Item(10, giftPacking, intTaxes);
		System.out.println(item2.getPrice());
		
		
	}
}
