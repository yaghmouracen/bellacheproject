package thirdpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {
    public static void main(String[] args) {

        String tempContainer;
        String finalOutput = "";
        try {
            FileReader fileReader = new FileReader("src/thirdpackage/data.text");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((tempContainer = bufferedReader.readLine()) != null) {
                finalOutput = finalOutput + tempContainer;

            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
