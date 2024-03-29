package ArithmeticOperations.operatorClasses;

import ArithmeticOperations.contract.Calculatable;

public class Addition extends Calculatable {
    public Addition() {
        super("+");
    }

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
