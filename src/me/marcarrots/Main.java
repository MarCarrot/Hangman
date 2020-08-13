package me.marcarrots;

public class Main {


    public static void main(String[] args) {
        System.out.println("hello");
        WordCollection wordCollection = new WordCollection();
        newGame(wordCollection);
    }

    private static void newGame(WordCollection wordCollection) {
        Game game = new Game(wordCollection.getNewWord());
        System.out.println(game.getWord());
        game.printBoard();
    }

}
