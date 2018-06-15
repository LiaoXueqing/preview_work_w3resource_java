package InputOutputFileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutputFileSystem_18 {
    public static void main(String[] args) {
        String fileName = "E:\\ThoughtWorks\\1.txt";
        try{
            Scanner sc = new Scanner(new File(fileName));
            String longestWord = "";

            while (sc.hasNext()) {
                String currentStr = sc.next();
                if (currentStr.length() > longestWord.length()) {
                    longestWord = currentStr;
                }
            }

            System.out.println("The longest word in a text file: "+longestWord);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
