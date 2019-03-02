package com.cherkasov.hw6;

import java.util.ArrayList;

public class Sorter {
    public Sorter(ArrayList<String> words){
        for(int i=0;i<(words.size())-1;i++) {
            String min=words.get(i);
            int minnum=i;
            for(int j=i+1;j<words.size();j++)
            {
                if(words.get(j).charAt(0)<min.charAt(0))
                {
                    min=words.get(j);
                    minnum=j;
                }
            }
            if(i!=minnum) {
                String temp = words.get(i);
                words.add(i,min);
                words.remove(i+1);
                words.add(minnum,temp);
                words.remove(minnum+1);
            }

        }
Shower shower=new Shower(words);
    }
}
