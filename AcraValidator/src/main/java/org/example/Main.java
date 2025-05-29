package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create Validator Objects
        UENValidator validator1 = new AcraBusinessValidator();
        UENValidator validator2 = new AcraEntityValidator();
        UENValidator validator3 = new AcraLocalValidator();

        while (true) {
            System.out.print("Enter UEN Number: ");
            String input = scanner.next();
            if (input.length() < 9 || input.length() > 10) {
                System.out.println("UEN Number Only contains 9 or 10 characters.");
                continue;
            }
            //Run the input through all 3 validators. If it passes any one of these, it will return valid UEN ^-^
            if (validator1.isValid(input) ||
                    validator2.isValid(input) ||
                    validator3.isValid(input)) {

                System.out.println("Valid UEN!");
                break; // End When valid UEN has been entered.
            } else {
                System.out.println("Wrong UEN.");
            }
        }
    }
}