import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class LabExer5A{
    private static Scanner input;
        public static void main(String[]args){
        Random generator = new Random();
        int numberToGuess = generator.nextInt(50-1)+1;
        int Guess;
        input = new Scanner(System.in);
        int attempt = 0;
        boolean win = false;
        while(!win){
            System.out.println("Guess a number from 1 to 50!");
            try{
                Guess = input.nextInt();
                attempt++;
                if(Guess<1||Guess>50){
                    System.out.println("Out of range.");
                    continue;
                }
                if(Guess==numberToGuess){
                    win = true;
                    break;
                }
                if(Guess<numberToGuess){
                    System.out.println("Too low. Try again.");
                }else{
                    System.out.println("Too high. Try again.");
                }
            }catch(InputMismatchException ex){
                System.out.println("Invalid input.");
                input.next();
            }
        }
        if(win){
            System.out.println("You got it in "+ attempt +" attemtpt(s)!");
        }
    }
}