package java_p;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {

    	 Scanner scan = new Scanner(System.in);
         Random random = new Random();

         int secretNumber = random.nextInt() ;
         int guess = 0;
         int attempts = 0;

         System.out.println("==================================");
         System.out.println("     NUMBER GUESSING GAME");
         System.out.println("==================================");
         System.out.println("I have chosen a number between 1 and 100.");
         System.out.println("Can you guess it?");

         while (guess != secretNumber) {

             System.out.print("Enter your guess: ");
             guess = scan.nextInt();
             attempts++;

             if (guess < secretNumber) {
                 System.out.println("Too low!");
             } else if (guess > secretNumber) {
                 System.out.println("Too high!");
             } else {
                 System.out.println("Congratulations!");
                 System.out.println("You guessed the correct number.");
                 System.out.println("Attempts: " + attempts);

                 if (attempts <= 5) {
                     System.out.println("Rating:Excellent");
                 } else if (attempts <= 10) {
                     System.out.println("Rating:Nice");
                 } else if (attempts <= 15) {
                     System.out.println("Rating: OK");
                 } else {
                     System.out.println("Keep practicing!");
                 }
             }
         }

        
    }

		
		
	}

