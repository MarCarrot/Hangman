package me.marcarrots;

import java.util.List;

public class Word {

    String word;

    List<Character> guessedLetters;

    public Word(String word) {
        this.word = word;
    }

    public int size() {
        return word.length();
    }

    public List<Character> getGuessedLetters() {
        return guessedLetters;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }

}
