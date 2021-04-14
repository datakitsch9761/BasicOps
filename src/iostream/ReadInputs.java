package iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadInputs {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Test.txt");

        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            System.out.println("Total size to read in bytes is " + fileInputStream.available());

            int content ;
            while((content = fileInputStream.read()) != -1) {
                //convert to char and display it
                System.out.print((char) content);
            }
        } catch (Exception e){

        }

//        byte data[] = new byte[12];
//        System.out.println("Enter some characters : ");
//        System.in.read(data);
//        System.out.println("You entered : ");
//
//        for(int i = 0; i < data.length;i++){
//            System.out.print((char) data[i]);
//        }
    }
}
