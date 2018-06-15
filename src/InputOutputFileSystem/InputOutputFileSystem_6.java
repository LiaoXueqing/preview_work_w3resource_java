package InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem_6 {
    public static void main(String[] args) {
        File file1 = new File("E:\\ThoughtWorks\\1.txt");
        File file2 = new File("E:\\ThoughtWorks\\2.txt");

        int comp = file1.compareTo(file2);
        System.out.println("file1 and file2 comparison: "+comp);
    }
}
