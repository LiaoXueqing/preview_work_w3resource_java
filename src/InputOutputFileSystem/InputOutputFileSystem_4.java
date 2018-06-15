package InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem_4 {
    public static void main(String[] args) {
        File file = new File("E:\\ThoughtWorks");
        if (file.canRead()) {
            System.out.println(file.getAbsolutePath()+" can read.");
        } else {
            System.out.println(file.getAbsolutePath()+" can not read.");
        }

        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath()+" can write.");
        } else {
            System.out.println(file.getAbsolutePath()+" can not write.");
        }
    }
}
