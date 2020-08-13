package me.marcarrots;

import java.util.Scanner;

public class Game {

    private int lives;
    private Word word;
    WordCollection wordCollection;


    public Game() {
        wordCollection = new WordCollection();
    }

    public void playAgain() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Would you like to play again? (Y/N): ");
        char guess = myObj.next().charAt(0);

        if (guess == 'y') {
            playMatch();
        } else {
            System.out.println("Thanks for playing!");
        }

    }

    public void playMatch() {
        word = wordCollection.getNewWord();
        lives = 7;
        printBoard();
        while (!word.isEmpty() && lives > 0) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter guess: ");
            Character guess = myObj.next().charAt(0);
            insertLetter(guess);
        }

        if (word.isEmpty()) {
            System.out.println("You win!");
        } else {
            System.out.printf("You ran out of lives! The word was: %s\n", word.toString());
        }

        playAgain();

    }

    public Word getWord() {
        return word;
    }

    public void printBoard() {
        System.out.println(word.getBoard());
    }

    public void insertLetter(Character letter) {

        if (word.getGuessedLetters().contains(letter)) {
            System.out.println("You already guessed this letter.");
            return;
        }

        word.insertGuessedLetter(letter);

        int amtFound = word.updateBoard(letter);
        printBoard();
        System.out.println("Notes: ");

        if (amtFound == 0) {
            System.out.println("None of this letter found");
            lives--;
        } else {
            System.out.printf("Letter %s found.\n", letter);
        }

        System.out.printf("Lives remaining: %d\n", lives);

        System.out.println();

    }



}
