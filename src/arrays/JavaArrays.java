package arrays;

public class JavaArrays {
    public static void main(String[] args) {
        //Arrays
        int[] arrInts = {2,4,5,8};
        for(int i = 0; i < arrInts.length;i++){
            System.out.println("item #" + arrInts[i]);
        }

        String [] arrStrings = {"Johan", "Arao", "Olga", "Fina"};
        for(int i = 0; i < arrStrings.length; i++ ){
            System.out.println("My Sibiligs : " + arrStrings[i]);
        }

        boolean[] arrBooleans = {true,false,false,true,true};
        for(int i =0; i < arrBooleans.length;i++){
            System.out.println("The result of Boolean Value : " + arrBooleans[i]);
        }

        //To figure it out the length of Array
        //System.out.println(arrInts.length);
    }
}
