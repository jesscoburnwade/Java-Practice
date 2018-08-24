package com.company;

public class Strings {

    public void count(String msg) {
        int i, j = 0, count = 0, tot = 0;

        for (i = msg.length(); i >= 0; i--, count++) {
            if (msg.substring(i - 1, i).equals(" ")) {
                String alpha;
                alpha = msg.substring(i, i + count);
                count = 0;
                System.out.println(alpha);

                tot = tot + alpha.length();
            }
        }
        for (j = 0; j < msg.length()- tot; j++, count++) {
            if (msg.substring(j, j+1).equals(" ")) {
                System.out.println(msg.substring(0,j));
            }
        }

    }
    public void printing(String msg) {
        int i;
        String word="";
        for (i = msg.length()-1; i >= 0; i--) {
            if( msg.substring(i,i+1).equals(" ")){
                System.out.print(word);
                word="";
                System.out.print(" ");
            }
            else{
                word=msg.substring(i,i+1)+word;
                // System.out.println(word);
            }
        }
        System.out.println(word);
    }
}