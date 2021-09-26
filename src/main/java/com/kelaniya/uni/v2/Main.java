package com.kelaniya.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //make validate arguments before using
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return;
        }

        //Add, Sub, Mul
        String operator = args[0];

        //another validation
        if (!(operator.equals("Add") || operator.equals("Sub") || operator.equals("Mul"))) {
            System.out.println("Please provide Add, Sub or Mul as the operator argument.");
            return;
        }

        //read the numbers.txt file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("/home/niro/Documents/GitHub/SoftwareConstruction/calculator/src/main/resources/input.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        double result = 0;

        if (operator.equals("Add")) {
            result = number1 + number2;
        } else if (operator.equals("Sub")) {
            result = number1 - number2;
        } else if (operator.equals("Mul")) {
            result = number1 * number2;
        }

        System.out.println("The result is " + result);

    }
}
