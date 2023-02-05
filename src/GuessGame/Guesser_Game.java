package GuessGame;

import java.util.Scanner;

class Umpire {
    int numGuess, GuessP1, GuessP2, GuessP3;
    public void getNumberFromGuesser() {
        SuperPlayer suplay = new SuperPlayer();
        numGuess = suplay.setNumber();
    }

    public void calculateResult() {
        if (GuessP1 == numGuess)
            System.out.println("Winner is GuessGame.Player 1!!");
        if (GuessP2 == numGuess)
            System.out.println("Winner is GuessGame.Player 2!!");
        if (GuessP3 == numGuess)
            System.out.println("Winner is GuessGame.Player 3!!");
        if (GuessP1 != numGuess && GuessP2 != numGuess && GuessP3 != numGuess)
            System.out.println("No Winners and the correct answer is " + numGuess);
    }

    public void getNumbersFromThePlayer() {
        Player play_1 = new Player();
        Player play_2 = new Player();
        Player play_3 = new Player();
        GuessP1 = play_1.setGuess();
        GuessP2 = play_2.setGuess();
        GuessP3 = play_3.setGuess();

    }
}

class SuperPlayer {
    int num;
    public int setNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to be guessed: ");
        num = scan.nextInt();
        return num;
    }
}

class Player {
    int guess;
    public int setGuess() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess the number: ");
        guess = scan.nextInt();
        return guess;
    }
}
public class Guesser_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int option = 1;
        while (option == 1) {
            Umpire umpire = new Umpire();
            umpire.getNumberFromGuesser();
            umpire.getNumbersFromThePlayer();
            umpire.calculateResult();

            System.out.print("Enter 1 to continue the game or enter 0 to end it: ");
            option = scan.nextInt();
        }
    }
}
