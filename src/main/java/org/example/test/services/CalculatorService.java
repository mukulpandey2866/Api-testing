package org.example.test.services;

public class CalculatorService {

    public static int addTwoNumbers(int a, int b){
        return a + b;
    }

    public static int subtractTwoNumbers(int a, int b){
        return a - b;
    }

    public static int multiplyTwoNumbers(int a, int b){
        return a * b;
    }

    public static double divideTwoNumbers(int a, int b){
        return a / b;
    }

    public static int addAnyNumbers(int ...numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
