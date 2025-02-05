package org.example.game;

import java.util.Scanner;

public class Guess {
    Scanner sc = new Scanner(System.in);
    Words words = new Words();
    private boolean play = true;
    int attempt = 0;
    public void start() {
        do {
            showWord();
            getInput();
            checkInput();
        }while (play == true);
    }

    private void checkInput() {
        if(words.validate()){
            System.out.println("Congrats you have guessed it right : "+words.word());
            end();
            play = false;
        }else if(!words.validate() && attempt >= words.getMaxTries()) {
            System.out.println("sorry, better luck next time");
            play = false;
        }
    }

    private void getInput() {
        System.out.println("Enter your guess");
        String input = sc.nextLine();
        attempt += 1;

        words.guess(input.charAt(0));
    }

    private void showWord() {
        System.out.println(words.getWordsAtRandom());
        System.out.println(words.word());
    }

    public void end() {
        sc.close();
    }
}
