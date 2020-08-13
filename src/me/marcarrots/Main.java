package me.marcarrots;

public class Main {


    public static void main(String[] args) {
        newGame();
    }

    private static void newGame() {
        Game game = new Game();
        game.playMatch();
    }

}
