import java.util.Scanner;
import java.util.Random;


// I LOVE GAMBLING
public class GamblingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int balance = 100;
        System.out.println("Welcome to Quang's Gambling House!");
        System.out.println("You start with $100. Guess correctly to double your bet. Guess wrong, and you lose your bet");
        while(balance > 0) {
            System.out.println("You currently have $" + balance);
            System.out.print("Enter your bet amount (or 0 to quit): ");
            int bet = scanner.nextInt();
            if(bet == 0) {
                System.out.println("What a failure. Not even a real gambler. Final balance: $" + balance);
                break;
            } else if(bet < 0 || bet > balance) {
                System.out.println("Invalid input. Learn to type nerd.");
                continue;
            }
            System.out.print("Guess the coin flip result (1 for heads, 2 for tails): ");
            int guess = scanner.nextInt();
            int flipResult = random.nextInt(2) + 1; 
            if(guess == flipResult) {
                balance += bet;
                System.out.println("Correct! You've doubled your bet.");
            } else {
                balance -= bet;
                System.out.println("HAHA YOU LOSE!!! STUPID IDIOT");
            }
        }
        if(balance <= 0) {
            System.out.println("welp. YOU LOST ALL YOUR MONEY! TIME TO LIQUIDATE ALL OF YOUR THINGS TO GAMBLE MORE!! QUICKLY NOW!!");
        }
        scanner.close();
    }
}
