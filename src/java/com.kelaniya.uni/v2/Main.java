package com.kelaniya.uni.v2;

public class Main {
    public static void main(String[] args) {
        //make validate arguments before using
        if(args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return;
        }

        //Add, Sub, Mul
        String operator = args[0];

        //another validation
        if( !(operator.equals("Add") || operator.equals("Sub") || operator.equals("Mul")) ){
            System.out.println("Please provide Add, Sub or Mul as the operator argument.");
            return;
        }

        System.out.println(args[0]);
    }
}
