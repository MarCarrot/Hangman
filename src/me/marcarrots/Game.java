package me.marcarrots;

public class Game {

    private int lives;
    private Word word;
    private String board;

    public Game(Word word) {
        this.lives = 3;
        this.word = word;
        generateBoard();
    }

    public Word getWord() {
        return word;
    }

    private void generateBoard() {
        board = "_".repeat(word.size());
    }

    public void printBoard() {
        System.out.println(board);
    }


}
