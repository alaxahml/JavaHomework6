package com.cherkasov.hw6;
/*
The purpose of the following programm is to separate words from some text,written by user.The output is:
blocks of words,sorted according to the first letter of a word.Moreover,the number of each word int the next is also written.
Class worker separates words,Sorter sorts array according to the first letter.Output is the purpose of Shower class.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sentence;
        Scanner in = new Scanner(System.in);
        sentence = in.nextLine();
        Worker worker=new Worker(sentence);
    }
}