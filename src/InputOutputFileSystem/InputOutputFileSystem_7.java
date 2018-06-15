package InputOutputFileSystem;

import java.io.File;
import java.util.Date;

public class InputOutputFileSystem_7 {
    public static void main(String[] args) {
        File file = new File("E:\\ThoughtWorks\\2.txt");
        Date date = new Date(file.lastModified());
        System.out.println("The last modified time of file "+file.getAbsolutePath()+": "+date);
    }
}
