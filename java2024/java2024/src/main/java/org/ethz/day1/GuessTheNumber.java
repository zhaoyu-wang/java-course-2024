package org.ethz.day1;

import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        
        int secretNumber = random.nextInt(1000); 
        
        // Initialize variables
        int guess;
        int attempts = 0;

        // Loop until the random guess matches the secret number
        do {
            guess = random.nextInt(1000); // Generate a random guess between 0 and 999
            ++attempts; // Increment the attempt count
            System.out.println("Attempt #" + attempts + ": Guess = " + guess);
        } while (guess != secretNumber);

        // Output the result
        System.out.println("The program guessed the secret number: " + secretNumber);
        System.out.println("It took " + attempts + " tries to guess the number.");
    }
}

