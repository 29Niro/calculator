package com.kelaniya.uni.v3;

import com.kelaniya.uni.v3.operation.AddOperation;
import com.kelaniya.uni.v3.operation.MulOperation;
import com.kelaniya.uni.v3.operation.SubOperation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

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
