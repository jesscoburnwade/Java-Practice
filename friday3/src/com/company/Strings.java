package com.company;

public class Strings {

    public void count2(String msg, String what) {
        int i = 0, num = 0, j;

        for (j = 0; j < msg.length(); j++) {
            if (msg.substring(j, j + 1).equals(what.substring(0, 1))) {
                for (; i < msg.length() - (what.length() - 1); i++) {
                    String alpha;
                    alpha = msg.substring(i, i + (what.length()));
                    if (alpha.equals(what))
                        num++;
                }
            }
        }
        if (num > 1)
            System.out.println("There are " + num + " " + what + "'s.");
        else
            System.out.println("There is " + num + " " + what + ".");
    }

}


