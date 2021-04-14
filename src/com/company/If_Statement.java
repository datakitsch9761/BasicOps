package com.company;

import javax.xml.transform.Source;

public class If_Statement {

    public static void main(String[] args) {
        // Basic operations
        //Addiction =+
        //Subtraction -
        //Multiplication *
        //Division '/'
        //Remainder : what remains.... 4 % 2 = 0 because 2 * 2 = 4 and there is not remainder

        //====Relational Operators====
        /*
        '==' comparison, not assignment
        '!=' Not Equal
         > greater than
         < less than
         >= greater than or equal
         =< less than or equal
         */

        double firstNum = 10;
        double secondNum = 2;
        double result = 0;

        result = firstNum % secondNum;
//        System.out.println("The sum is " + (firstNum + secondNum));
//        System.out.println("The minus is " + (firstNum - secondNum));
//        System.out.println("The multiplication is " + (firstNum * secondNum));
//        System.out.println("The division is " + (firstNum / secondNum));
//        System.out.println("The remainder is " + (result));

        //If statements
        if (firstNum == secondNum) {
            System.out.println("The remainder is " + result);
        }else{
            System.out.println("Hello");
        }
        if(firstNum != secondNum){
            System.out.println("The remainder is " + result);
        }else{
            System.out.println("Numbers aren't equal");
        }
        if(firstNum > secondNum){
            System.out.println("The remainder is " + result);
        }else{
            System.out.println("Numbers aren't equal");
        } if(firstNum < secondNum){
            System.out.println("The remainder is " + result);
        }else{
            System.out.println("Numbers aren't equal");
        } if(firstNum >= secondNum){
            System.out.println("The remainder is " + result);
        }else{
            System.out.println("Numbers aren't equal");
        }
        if(firstNum <= secondNum){
            System.out.println("The remainder is " + result);
        }else{
            System.out.println("Numbers aren't equal");
        }
    }
}
