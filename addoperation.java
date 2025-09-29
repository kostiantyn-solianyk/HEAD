// AddOperation.java
public class AddOperation implements Operation {
    @Override
    public double apply(double a, double b) {
        return a + b;
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}