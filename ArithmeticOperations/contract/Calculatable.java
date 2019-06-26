package ArithmeticOperations.contract;

public abstract class Calculatable {
    public String keyStr;

    public Calculatable(String keyStr) {
        this.keyStr = keyStr;
    }

    public abstract double calculate(double a, double b);
}
