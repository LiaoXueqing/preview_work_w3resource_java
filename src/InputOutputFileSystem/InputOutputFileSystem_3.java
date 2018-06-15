package InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem_3 {
    public static void main(String[] args) {
        File file = new File("E:\\ThoughtWorks");
        if (file.exists()) {
            System.out.println("The directory or file exists.");
        } else {
            System.out.println("The directory or file does not exist.");
        }
    }
}
