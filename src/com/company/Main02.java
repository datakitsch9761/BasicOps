package com.company;

import java.util.Base64;

public class Main02 {
        public static void main(String[] args) {
            Basketball basketball = new Basketball();
            Baseball baseball = new Baseball();

            basketball.setColor("Blue");
            basketball.setName("Basketball");

            baseball.setColor("Brown");
            baseball.setName("Baseball");

       basketball.bounce();
       basketball.isNBA();
            System.out.println(basketball.isNBA());
        }
    }
