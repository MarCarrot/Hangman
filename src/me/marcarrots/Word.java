package me.marcarrots;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashSet;
import java.util.Set;

public class Word {

    private final String fullWord;

    public String getBoard() {
        return board;
    }

    private String board;
    private int remaining;

    private final Set<Character> guessedLetters;

    public Word(String word) {
        this.fullWord = word;
        remaining = word.length();
        board = "_".repeat(word.length());
        guessedLetters = new HashSet<>();
    }

    public Set<Character> getGuessedLetters() {
        return guessedLetters;
    }

    @Override
    public String toString() {
        return fullWord;
    }

    public void insertGuessedLetter(Character letter) {
        try {
            guessedLetters.add(letter);
        } catch (NullPointerException e) {
            System.out.println("Nullpointer.");
        }
    }

    public int updateBoard(Character letter) {

        int amtFound = 0;

        for (int i = 0; i < fullWord.length(); i++) {
            if (fullWord.charAt(i) == letter) {
                board = board.substring(0, i) + letter + board.substring(i + 1);
                amtFound++;
                remaining--;
            }
        }

        return amtFound;

    }

    public boolean isEmpty() {
        return remaining == 0;
    }



}
