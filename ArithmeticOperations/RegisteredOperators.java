package ArithmeticOperations;

import ArithmeticOperations.operatorClasses.Addition;
import ArithmeticOperations.operatorClasses.Division;
import ArithmeticOperations.operatorClasses.Multiplication;
import ArithmeticOperations.operatorClasses.Subtraction;
import ArithmeticOperations.contract.Calculatable;

import java.util.HashMap;
import java.util.Map;

public class RegisteredOperators {
    Calculatable[] operators = {
            new Addition(),
            new Division(),
            new Multiplication(),
            new Subtraction()
    };

    public Map<String, Calculatable> getOperatorsMap() {
        Map<String, Calculatable> operatorsMap = new HashMap<>();
        for (Calculatable operator : operators) {
            operatorsMap.put(operator.keyStr, operator);
        }
        return operatorsMap;
    }

}
