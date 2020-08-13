package me.marcarrots;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordCollection {

    List<Word> words;

    public WordCollection() {

        words = new ArrayList<>();
        try {
            File listOfWords = new File("words.txt");
            Scanner myReader = new Scanner(listOfWords);
            while (myReader.hasNextLine()) {
                words.add(new Word(myReader.nextLine()));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public Word getNewWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }

}
