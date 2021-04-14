package com.company;

public class Basketball extends Ball2{
    public boolean isNBA;
    public int capacity;

    @Override
    public void bounce() {
        System.out.println("Basketball Bouncing");
    }

    //Behaviors
    public boolean isNBA() {

        if (isNBA == true) {
            return  true;
        }else {
            return false;
        }







    }
}

