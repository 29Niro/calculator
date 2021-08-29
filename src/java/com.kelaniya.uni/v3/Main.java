package com.kelaniya.uni.v3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();
        Double number1 = numbers[0];
        Double number2 = numbers[1];

        double result = 0;

        if (operator.equals("Add")) {
            AddOperation addOperation = new AddOperation();
            result = addOperation.execute(numbers);
        } else if (operator.equals("Sub")) {
            SubOperation subOperation = new SubOperation();
            result = subOperation.execute(numbers);
        } else if (operator.equals("Mul")) {
            MulOperation mulOperation = new MulOperation();
            result = mulOperation.execute(numbers);
        }

        System.out.println("The result is " + result);

    }
}
