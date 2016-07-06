package template;

import java.util.function.Consumer;

public class Main {
	
	public static void main(String[] args) {
		Banking banking = new Banking();
		Operation op = new Operation();
		Consumer<Operation> pos = op2 ->{System.out.println("pos process");};
		banking.processOperation(op, Main::preOperation, pos);
	}
	
	private static void preOperation(Operation op) {
		System.out.println("pre process");
	}
}
