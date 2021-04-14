package autoboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //int, chars, long, float,doubles,booleans, byte ... -> primitive variables that arent object
        //Integer,Characters,Long,Float,Doubles,Boooleans,Byte ... ->  These are object types

        int i = 32;
        int b = 23;
        char myChar = 'D';
        Character myCharacter = new Character(myChar);
        int recoverchar = myCharacter.charValue();

        //physically wrapping my int primitive variables.
        Integer myObject = new Integer(b);

        //Unwrapping the Integer object
        int recoverInt = myObject.intValue();

        //autoboxing happens automatically
        ArrayList<Integer> myArray = new ArrayList();
        myArray.add(i);

        int myItem = myArray.get(0);
        System.out.println(myArray);
    }
}
