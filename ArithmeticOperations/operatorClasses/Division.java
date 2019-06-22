package ArithmeticOperations.operatorClasses;

import ArithmeticOperations.contract.Calculatable;

public class Division extends Calculatable {
    public Division() {
        super('/');
    }

    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
