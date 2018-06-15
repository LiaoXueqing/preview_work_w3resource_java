package InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem_1 {
    public static void main(String[] args) {
        File file = new File("E:\\ThoughtWorks");
        String[] fileList = file.list();
        System.out.println("All file/directory names from the given:");
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
