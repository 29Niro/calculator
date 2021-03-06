package com.kelaniya.uni.v3;

public class CommandLineInputs {

    private String[] args;

    //constructor of the class
    public CommandLineInputs(String[] arguments){
        this.args = arguments;
    }

    public String getOperator(){
        //make validate arguments before using
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return "";
        }

        //Add, Sub, Mul
        String operator = args[0];

        //another validation
        if (!(operator.equals("Add") || operator.equals("Sub") || operator.equals("Mul"))) {
            System.out.println("Please provide Add, Sub or Mul as the operator argument.");
            return "";
        }
        
        return operator;
    }
}
