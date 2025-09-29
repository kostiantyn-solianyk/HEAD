// SubtractOperation.java
public class SubtractOperation implements Operation {
    @Override
    public double apply(double a, double b) {
        return a - b;
    }

    @Override
    public String getSymbol() {
        return "-";
    }
}