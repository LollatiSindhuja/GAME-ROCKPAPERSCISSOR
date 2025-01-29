//program for rock paper scissor game
import java.util.Scanner;
import java.util.Random;

public class GameROCKPAPERSCISSOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] options = { "Rock", "Paper", "Scissor" };
        System.out.println("Welcome to Rock-Paper-Scissor!");
        System.out.println("Enter your choice (Rock, Paper, or Scissor): ");
        //Taking users choice
        String userChoice = sc.nextLine().trim().toLowerCase();
        //Taking computer choice
        int computerIndex = random.nextInt(3);
        String computerChoice = options[computerIndex].toLowerCase();

        System.out.println("You chose: " + capitalize(userChoice));
        System.out.println("Computer chose: " + capitalize(computerChoice));
        //displaying the results
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            System.out.println("You win!");
        } else if ((computerChoice.equals("rock") && userChoice.equals("scissors")) ||
                (computerChoice.equals("scissors") && userChoice.equals("paper")) ||
                (computerChoice.equals("paper") && userChoice.equals("rock"))) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid input. Please enter Rock, Paper, or Scissor.");
        }
    }

    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}
