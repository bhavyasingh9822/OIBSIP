import java.lang.*;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public NumberGuessingGame(){
    }

    public static void main(String[] args) {
        int maxValue = 100; 
        Random random = new Random();
        int randomNumber = random.nextInt(maxValue + 1); //maxValue + 1 
        Scanner sc = new Scanner(System.in);

        boolean isMatched = false;
        int attempts = 0; 
        int score = 100; //Initialize the score to 100
        int maxAttempts = 6; //Set the maximum number of attempts to 6

        while (!isMatched && attempts < maxAttempts) { //Check both conditions
            System.out.println("Enter the value that you want between 1 to 100:");
            int n = sc.nextInt(); //Taking user input

            attempts++;

            //Matching conditions
            if (n == randomNumber) {
                System.out.println("The number is matched");
                isMatched = true;
            }
            else if (n > randomNumber) {
                System.out.println("Enter Lower Number Please!");
            } 
            else {
                System.out.println("Enter Greater Number Please!");
            }

            //Number of attempts taken to finish the game and the score you got 
            if (isMatched) {
                System.out.println("You guessed the number in " + attempts + " attempts.");
                if (attempts == 1) {
                    System.out.println("Score: " + score);
                } else if (attempts == 2) {
                    score = 90; 
                    System.out.println("Score: " + score);
                } else if (attempts == 3){
                    score = 80; 
                    System.out.println("Score: " + score);      
                } else if (attempts == 4){
                    score = 70; 
                    System.out.println("Score: " + score);      
                } else if (attempts == 5){
                    score = 60; 
                    System.out.println("Score: " + score);      
                }
                 else if (attempts == 6){
                    score = 50; 
                    System.out.println("Score: " + score);      
                }
                 else if (attempts == 7){
                    score = 40; 
                    System.out.println("Score: " + score);      
                }
                 else if (attempts == 8){
                    score = 30; 
                    System.out.println("Score: " + score);      
                }
                 else if (attempts == 9){
                    score = 20; 
                    System.out.println("Score: " + score);      
                }
                 else if (attempts == 10){
                    score = 10; 
                    System.out.println("Score: " + score);      
                }
            }
        }

        //End the game after 10 number of attempts 
        if (!isMatched) {
            System.out.println("YOU LOST THE GAME");
        }
    }
}
