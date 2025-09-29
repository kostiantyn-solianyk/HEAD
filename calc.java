// Calculator.java
import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String, Operation> operations = new HashMap<>();

    public Calculator() {
        // register available operations
        register(new AddOperation());
        register(new SubtractOperation());
        // you can easily add new operations later
    }

    public void register(Operation op) {
        operations.put(op.getSymbol(), op);
    }

    public double calculate(String symbol, double a, double b) {
        Operation op = operations.get(symbol);
        if (op == null) {
            throw new IllegalArgumentException("Operation not supported: " + symbol);
        }
        return op.apply(a, b);
    }

    public boolean supports(String symbol) {
        return operations.containsKey(symbol);
    }
}