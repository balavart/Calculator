package ArithmeticOperations.operatorClasses;

import ArithmeticOperations.contract.Calculatable;

public class Multiplication extends Calculatable {
    public Multiplication() {
        super('*');
    }

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
