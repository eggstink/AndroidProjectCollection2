package com.example.androidprojectcollection;
import java.util.Stack;

public class Calculate {

    private Stack<Double> numbers;
    private Stack<Character> operations;
    private StringBuilder currentNumber;
    private StringBuilder currentNumberSeq;
    private Stack<Double>  numbersSeq;

    private Stack<Character> operationsSeq;

    public String toCalc;
    boolean is2Nums;

    public Calculate(String toCalc) {
        numbers = new Stack<>();
        operations = new Stack<>();
        currentNumber = new StringBuilder();
        numbersSeq = new Stack<>();
        operationsSeq = new Stack<>();
        currentNumberSeq = new StringBuilder();
        this.is2Nums = false;
        this.toCalc=toCalc;
    }

    public void appendDigit(int digit) {
        currentNumber.append(digit);
        currentNumberSeq.append(digit);
    }

    public void appendDecimalPoint() {
        if (!currentNumber.toString().contains(".")) {
            currentNumber.append(".");
            currentNumberSeq.append(".");
        }
    }

    public void builder() {
        for (int i = 0; i < toCalc.length(); i++) {
            if (toCalc.charAt(i) == '*') {
                performOperation('*');
            }
            if (toCalc.charAt(i) == '+') {
                performOperation('+');
            }
            if (toCalc.charAt(i) == '/') {
                performOperation('/');
            }
            if (toCalc.charAt(i) == '-') {
                performOperation('-');
            }
            if (toCalc.charAt(i) == '.') {
                appendDecimalPoint();
            }

            if (toCalc.charAt(i) == '1') {
                appendDigit(1);
            }
            if (toCalc.charAt(i) == '2') {
                appendDigit(2);
            }
            if (toCalc.charAt(i) == '3') {
                appendDigit(3);
            }
            if (toCalc.charAt(i) == '4') {
                appendDigit(4);
            }
            if (toCalc.charAt(i) == '5') {
                appendDigit(5);
            }

            if (toCalc.charAt(i) == '6') {
                appendDigit(6);
            }
            if (toCalc.charAt(i) == '7') {
                appendDigit(7);
            }
            if (toCalc.charAt(i) == '8') {
                appendDigit(8);
            }
            if (toCalc.charAt(i) == '9') {
                appendDigit(9);
            }
            if (toCalc.charAt(i) == '0') {
                appendDigit(0);
            }

        }
    }

    public void performOperation(char operation) {
        if(currentNumber.length()>=2){
            is2Nums = true;
        }
        if (currentNumber.length() > 0) {
            numbers.push(Double.parseDouble(currentNumber.toString()));
            currentNumber.setLength(0);
        }
        if (!operations.isEmpty() && precedence(operations.peek()) >= precedence(operation)){
            evaluateStackTop();
        }
        operations.push(operation);
    }

    public double evaluate() {
        builder();
        if (currentNumber.length() > 0) {
            numbers.push(Double.parseDouble(currentNumber.toString()));
            currentNumber.setLength(0);
        }while (!operations.isEmpty()) {
            evaluateStackTop();
        }
        return numbers.pop();
    }

    private void evaluateStackTop() {
        double b = numbers.pop();
        double a = numbers.pop();
        char op = operations.pop();
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        numbers.push(result);
    }

    private int precedence(char op) {
        if (op == '*' || op == '/') {
            return 2;
        } else if (op == '+' || op == '-') {
            return 1;
        } else {
            return 0;
        }
    }
}