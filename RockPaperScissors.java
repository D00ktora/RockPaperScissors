import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //constants
        final String rock = "Rock";
        final String paper = "Paper";
        final String scissors = "Scissors";

        //flags
        boolean isEndGame = false;
        boolean isAnotherGame = false;
        boolean isAutoReset = false;
        

        //input
        String input = "";

        //variable for player move
        String playerMove = "";

        //Output -> Choose a option
        System.out.print("Choose one of the option [r]rock, [p]paper or [s]scissors: ");

        //read the input from the console
        input = scanner.nextLine();

        //check the input and if its not valid terminate the program with error message
        if (input.equals("r") || input.equals("rock")) {
            playerMove = rock;
        } else if (input.equals("p") || input.equals("paper")) {
            playerMove = paper;
        } else if (input.equals("s") || input.equals("scissors")) {
            playerMove = scissors;
        } else {
            System.out.println("Invalid input. Please restart the game and try again :)");
            return;
        }

        //variable for random move or the computer choose
        Random random = new Random();
        int randomComputerValue = random.nextInt(4);
        String computerMove = "";

        switch (randomComputerValue) {
            case 1:
                computerMove = rock;

                //print computer choose
                System.out.println("Computer choose: rock");
                break;
            case 2:
                computerMove = paper;
                //print computer choose
                System.out.println("Computer choose: paper");
                break;

            case 3:
                computerMove = scissors;
                //print computer choose
                System.out.println("Computer choose: scissors");
                break;
        }


        //evaluate the winner and print the result on the console
        switch (playerMove) {
            case "Rock":
                if (computerMove == scissors){
                    System.out.println("Computer choose scissors, but you choose rock.");
                    System.out.println("You win");
                } else if (computerMove == rock) {
                    System.out.println("You and the computer choose rock.");
                    System.out.println("This game was a DRAW!");
                } else if (computerMove == paper) {
                    System.out.println("Your choose rock, but computer choose paper.");
                    System.out.println("You loose");
                }
                break;
            case "Paper":
                if (computerMove == scissors){
                    System.out.println("Your choose paper, but computer choose scissors.");
                    System.out.println("You loose");
                } else if (computerMove == rock) {
                    System.out.println("Computer choose rock, but you choose paper.");
                    System.out.println("You win");
                } else if (computerMove == paper) {
                    System.out.println("You and the computer choose paper.");
                    System.out.println("This game was a DRAW!");
                }
                break;
            case "Scissors":
                if (computerMove == scissors){
                    System.out.println("You and the computer choose scissors.");
                    System.out.println("This game was a DRAW!");
                } else if (computerMove == rock) {
                    System.out.println("Your choose scissors, but computer choose rock.");
                    System.out.println("You loose");
                } else if (computerMove == paper) {
                    System.out.println("Computer choose paper, but you choose scissors.");
                    System.out.println("You win");
                }
                break;
        }
    }
}