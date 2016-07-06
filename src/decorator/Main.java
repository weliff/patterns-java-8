package decorator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {

	
	public static void main(String[] args) {
		//TESTES
		Function<Integer, Integer> giftPacking = value -> {return value + 20;};
		Function<Object, String> intTaxes = value -> value + "15";
		Function<String, String> ff = value -> value + "16";
		BinaryOperator<String> bi = (a, b) -> a.concat(b);
		String result = bi.andThen(intTaxes).andThen(ff).apply("a", "b");
		
		System.out.println(result);
		giftPacking.andThen(intTaxes);
		
		Function<Integer, Integer> fff = Packing::giftPacikng;
		Function<Integer, Integer> fff2 = Taxes::intTaxes;
		Function<Integer, Integer> fff3 = fff.andThen(fff2).andThen(fff);
		System.out.println(fff3.apply(3));
		
		
		//DECORATOR
		Item item2 = new Item(10, Packing::giftPacikng, Taxes::intTaxes, giftPacking);
		System.out.println(item2.getPrice());
		
		
	}
}
