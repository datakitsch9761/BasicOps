package arrays;

public class Main {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5,6,7};
        String[] myStringArray = {"Hello","Hi","What"};

        int[] newArray = new int[6];
        String[] newString = new String[6];

        newArray[0] = 3;
        newArray[1] = 4;
        newArray[2] = 6;
        newArray[3] = 1;
        newArray[4] = 12;
        newArray[5] = 54;
        for(int i = 0; i < newArray.length;i++){
            System.out.println(newArray[i]);
        }

        newString[0] = "A";
        newString[1] = "B";
        newString[2] = "C";
        newString[3] = "D";
        newString[4] = "E";
        newString[5] = "F";
        for(int i = 0; i < newString.length; i++){
            System.out.println(newString[i]);
        }

        //Array have length
        for(int i = 0; i < myStringArray.length; i++){
            System.out.println("Item " + myStringArray[i]);
        }
    }
}
