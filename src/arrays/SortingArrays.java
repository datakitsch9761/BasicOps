package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[]  arrInts = {4,2,8,5};
        String[] arrStrings = {"Johana","Arao","Ines","Olga","Fina"};
        boolean[] arrBoolean = {true,false,true,false};

        int[] newArray = new int[4];
        newArray[0] = 12;
        newArray[1] = 13;
        newArray[2] = 45;
        newArray[3] = 23;

        Arrays.sort(arrStrings);
        Arrays.sort(arrInts);


        for(int i = 0 ; i < arrInts.length;i++){
            System.out.println("Item$ :" + arrInts[i]);
        }

        for(int i = 0; i < arrStrings.length;i++){
            System.out.println("My Siblings : " + arrStrings[i]);
            System.out.println("-=============================-");
        }

        Arrays.sort(arrStrings);


        for(int i = 0; i < arrStrings.length;i++){
            System.out.println("My Siblings : " + arrStrings[i]);
        }

//        for(int i = 0; i < arrBoolean.length;i++){
//            System.out.println("Output : " + arrBoolean[i]);
//        }


    }
}
