import ArithmeticOperations.RegisteredOperators;
import ArithmeticOperations.contract.Calculatable;

import java.util.Map;
import java.util.Scanner;

public class Calculator {
    private Scanner sc = new Scanner(System.in);
    private Map<Character, Calculatable> operatorsMap = new RegisteredOperators().getOperatorsMap();

    private double getOperand(String prompt) {
        Double operand = null;
        while (operand == null) {
            System.out.println(prompt);
            try {
                operand = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number!, try again");
            }
        }
        return operand;
    }

    private Calculatable getOperator() {
        while (true) {
            System.out.println("Type arithmetic operation:" + getSym());
            String input = sc.nextLine();
            Character operator = input.charAt(0);
            Calculatable operation = operatorsMap.get(operator);

            if (operation != null) {
                return operation;
            }
            System.out.println("This operator: " + " ' " + input + " ' " + " is not valid!, try again");
        }
    }

    private void showResult(Calculatable operation, double firstOperand, double secondOperand) {
        double result = operation.calculate(firstOperand, secondOperand);
        System.out.println(firstOperand + " " + operation.keyChar + " " + secondOperand + " = " + result);
    }

    private boolean continueOrNot() {
        System.out.println("To continue type \"Yes\"");
        String answer = sc.nextLine();
        return answer.equalsIgnoreCase("yes");
    }

    private String getSym() {
        String symbol = "";
        for (Map.Entry character : operatorsMap.entrySet()) {
            symbol += " " + character.getKey();
        }
        return symbol;
    }

    public void start() {
        boolean needToContinue = true;
        while (needToContinue) {
            double first = getOperand("Type first number");
            double second = getOperand("Type second number");
            Calculatable operation = getOperator();
            showResult(operation, first, second);
            needToContinue = continueOrNot();
        }
        System.out.println("Thank you for using calculator. Good luck!");
    }
}

