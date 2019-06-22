package ArithmeticOperations.contract;

public abstract class Calculatable {
    public Character keyChar;

    public Calculatable(Character keyChar) {
        this.keyChar = keyChar;
    }

    public abstract double calculate(double a, double b);
}
