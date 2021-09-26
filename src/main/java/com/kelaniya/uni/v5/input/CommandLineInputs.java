package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs{

    private final String[] args;

    //constructor of the class
    public CommandLineInputs(String[] arguments){
        this.args = arguments;
    }

    public String getOperator() throws InvalidInputException {
        //make validate arguments before using
        if (args.length == 0) {
            throw new InvalidInputException("Please provide the operation as an argument");
        }

        //Add, Sub, Mul
        String operator = args[0];

        //another validation
        if (!(operator.equals("Add") || operator.equals("Sub") || operator.equals("Mul") || operator.equals("Div"))) {
            throw new InvalidInputException("Please provide Add, Sub or Mul s the operator argument");

        }
        
        return operator;
    }
}
