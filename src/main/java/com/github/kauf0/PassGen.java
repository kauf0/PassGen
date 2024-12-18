package com.github.kauf0;

import java.security.SecureRandom;
import java.util.Scanner;

public class PassGen {
    // This function handles the password generation
    static String passwordGenerator(int length){
        // Partially sourced from https://github.com/Shriyapd/Java-Password-Generator
        String charIndex = "1234567890!@#$%^&*()_+-/.,<>?;':\\\"[]{}\\\\|`~abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomPassword = new StringBuilder();

        // Use more cryptographically strong SecureRandom instead of simple Random
        SecureRandom rnd = new SecureRandom();
        // Generates the password itself
        while (randomPassword.length() < length) {
            // gets random symbol from charIndex
            int index = (int) (rnd.nextFloat() * charIndex.length());
            randomPassword.append(charIndex.charAt(index));
        }

        return randomPassword.toString();
    }

    public static void main(String[] args) {
        // This program's purpose is to generate random passwords based on the user defined settings
        // Such as length and complexity.

        // For this everything will supposedly be put inside loop, make it listen for length and amount ints
        // + make multiple choice for complexity (I'm thinking of some sort of linux-like util that they use there to check
        // them password complexity.
        
        // I also would like to implement some TUI here (and if I do, then make the same for CalcCli)

        // Read the input for length of the new password
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int length = scanner.nextInt();
            // Invoke random password generator
            System.out.println(passwordGenerator(length));
        }
    }
}