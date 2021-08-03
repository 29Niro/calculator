package com.kelaniya.uni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String... args) {
        int answer = 0;
        try{
            File myObj = new File("src/main/resources/input.txt");
            Scanner myReader = new Scanner(myObj);
            int numA = myReader.nextInt();
            int numB = myReader.nextInt();
            //System.out.print(numA);
            //System.out.println(" ");
            //System.out.print(numB);
            myReader.close();

            System.out.println("Type an operation Add or Sub or Mul :");
            Scanner newLine = new Scanner(System.in);
            String operation = newLine.nextLine();
            System.out.println(operation);

            switch (operation){
                case "Add": answer = numA + numB;
                break;
                case "Sub": answer = numA - numB;
                break;
                case "Mul": answer = numA * numB;
                break;
            }

            System.out.print(answer);
        } catch (FileNotFoundException e){
            System.out.println("An Error");
            e.printStackTrace();
        }

    }
}
