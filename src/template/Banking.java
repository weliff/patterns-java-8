package template;

import java.util.function.Consumer;

public class Banking {
	
	public void processOperation(Operation op, Consumer<Operation> preOperation, Consumer<Operation> posOperation){
		preOperation.accept(op);
		process(op);
		posOperation.accept(op);
	}
	
	
	private void process(Operation op) {
		op.process();
	}

}
