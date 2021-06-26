package assignment1;

import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    static final String[] CANDIDATES = {"cat", "dad", "dog", "mom", "rat"};
    static final int COUNT = 5;
    static char[] init = {'_','_','_'};
    static String guess = "";


    public int getCountLeft(int count){
        return COUNT - count;
    }

    public String getMissGuess(String s){
        return guess+= s;
    }

    public void print(int count ){
        System.out.println("Missed letters (" + this.getCountLeft(count)+ " left):" + guess);
        System.out.println("Current guess:" + String.valueOf(init));
    }

    public void print(String s){
        System.out.println("Guess a letter: " + s);
    }


    private void guessBuilder(String secretWord, String s) {
        for (int i = 0; i <3; i++){
            if (secretWord.charAt(i) == s.charAt(0)){
                init[i] = s.charAt(0);
            }
        }

    }

    public static void main(String[] args) {
        String secretWord = args.length > 0
                ? CANDIDATES[Integer.parseInt(args[0])]
                : CANDIDATES[new Random().nextInt(CANDIDATES.length)];

        // Your code goes here:
        WordGuess wordGuess = new WordGuess();

        //secretWord ="dad";


            int i = 0;

            while (i < 5) {

                wordGuess.print(i);

                Scanner sc = new Scanner(System.in); //System.in is a standard input stream
                String str = sc.nextLine();//reads string


                if (secretWord.contains(str)) {
                    wordGuess.guessBuilder(secretWord, str);
                    if (secretWord.equals(String.valueOf(init))){
                        System.out.println("Missed letters: " + String.valueOf(guess));
                        System.out.println("Final guess: "+String.valueOf(init));
                        System.out.println("Congratulations! You got it!");
                        break;
                    }

                } else {

                    wordGuess.print(str);
                    WordGuess.guess += str;
                    i++;
                }
            }

            if (i == 5) {

                System.out.println("Missed letters: " + guess);
                System.out.println("Final guess: " + String.valueOf(init));
                System.out.println("Sorry, too many misses. The secret word was " + secretWord);
            }


    }




}
