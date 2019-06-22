package ArithmeticOperations.operatorClasses;

import ArithmeticOperations.contract.Calculatable;

public class Subtraction extends Calculatable {
    public Subtraction() {
        super('-');
    }

    public double calculate(double a, double b) {
        return a - b;
    }
}
