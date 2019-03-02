package com.cherkasov.hw6;

import java.util.ArrayList;

public class Shower {
    public Shower(ArrayList<String> words){
        char current=words.get(0).charAt(0);
        System.out.print(current+": ");
        while(true){
            int i=0;
            int j=i+1;
            int k=1;
            if(words.get(i).charAt(0)!=current){
                current=words.get(i).charAt(0);
                System.out.print(current+": ");
            }
            while(j<words.size() && words.get(j).charAt(0)==words.get(i).charAt(0)){
                if(words.get(i).equals(words.get(j))){
                    words.remove(j);
                    k++;
                }
                else
                    j++;
            }
           System.out.println(words.get(i)+" "+k);
            words.remove(i);
            if(words.size()==0){
                break;
            }
        }
    }
}
