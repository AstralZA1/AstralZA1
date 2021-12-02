import java.util.Scanner;
public class NumberGuessingGame {
    private static Scanner keyboard;

    public static void main(String[]args){
        keyboard = new Scanner(System.in);
        int rounds = 1;
        int win = 0;
        int lose = 0;
        int secretNumber;
        System.out.println("How many times do you want to play the game:");
        int numberofguess = keyboard.nextInt();
        for(int i=0; i<numberofguess;i++){
        secretNumber = (int)(Math.random()*999+1);
        int guess;
        do{
            System.out.println("Round:"+rounds);
            System.out.print("Enter a guess(1-1000): ");
            guess = nextValidInt(keyboard);
            rounds++;
            if(guess==secretNumber){
            win++;
            System.out.println("Your guess is correct Congratulations!");
            }else if(guess<secretNumber){
            lose++;
            System.out.println("Your guess is smaller than the secret number.");
            }else if(guess>secretNumber){
            System.out.println("Your guess is greater than the secret number.");
            lose++;
        }else{
}
        System.out.print("Your guess: "+guess + " Secret Number: "+secretNumber);
        System.out.println("");
        System.out.println("Wins: "+win + " Loses: "+lose);
    }while(i>numberofguess);
    }
}

public static int nextValidInt(Scanner s) {
    while (!s.hasNextInt() && s.hasNext()) {
        System.out.println("Please provide a valid integer value!");
        s.next();
    }
    return s.nextInt();
}
}