package com.cherkasov.hw6;

import java.util.ArrayList;

public  class Worker {
    private ArrayList<String> words= new ArrayList<String>();
    public Worker(String sentence){
      for(int i=0;i<sentence.length()-1;i++){
          int j=i;
          while(sentence.charAt(j)>=65 && sentence.charAt(j)<=122){
            if((j == (sentence.length() - 1)) || (sentence.charAt(j + 1) < 65) || (sentence.charAt(j + 1) > 122)){

                String temp= sentence.substring(i, j + 1);
                words.add(temp);
                break;
            }
              j++;
          }
          i=j;
      }
      for(int i=0;i<words.size();i++){
          if(words.get(i).charAt(0)<97){


              words.add(i,words.get(i).toLowerCase());
              words.remove(i+1);
          }
      }
      if(words.size()>0) {
          Sorter sorter = new Sorter(words);
      }
      else
          System.out.println("I have not found any words here!");
    }
}
