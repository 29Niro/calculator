package com.kelaniya.uni.v4.operation;

//Factory design pattern
public class OperationFactory {

    public Operation getInstance(String operator){
        Operation operation = null;
        if (operator.equals("Add")) {
            operation = new AddOperation();
        } else if (operator.equals("Sub")) {
            operation = new SubOperation();
        } else if (operator.equals("Mul")) {
            operation = new MulOperation();
        } else if (operator.equals("Div")) {
            operation = new DivOperation();
        }

        return operation;
    }

}
