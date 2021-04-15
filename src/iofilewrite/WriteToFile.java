package iofilewrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        File file = new File("src/iostream/Test.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Today is a good day indeed ......");

            fileWriter.close();

            // Read it all back to us.
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {

        }
    }
}