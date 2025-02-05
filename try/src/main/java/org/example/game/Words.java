package org.example.game;

import java.util.Random;

public class Words {

    private String [] randomWords = {"animals", "happiness", "steady", "indefinite", "birthday", "rights", "extreme", "property"};
    private String selectedWord;
    private char[] letters;
    Random randomNumber = new Random();
    StringBuilder w;

    public Words() {
        this.selectedWord = randomWords[randomNumber.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    }

    int getMaxTries(){
        int max = 0;
        for(String w : randomWords){
            if(w.length() > max){
                max = w.length();
            }
        }

        return max;
    }

    String getWordsAtRandom(){
        return selectedWord;
    }

    String word(){
        w = new StringBuilder();

        for (char letter : letters){
            w.append( (letter == '\u0000') ? '-' : letter);
            w.append(' ');
        }

        return w.toString();
    }

    public void guess(char input) {
        for (int i = 0 ; i < selectedWord.length() ; i++){
            if (input == selectedWord.charAt(i)){
                letters[i] = input;
            }
        }
    }

    public boolean validate() {
        for (char letter : letters){
            if(letter == '\u0000'){
                return false;
            }
        }

        return true;
    }
}
