package InputOutputFileSystem;

import java.io.File;
import java.io.FilenameFilter;

public class InputOutputFileSystem_2 {
    public static void main(String[] args) {
        File file = new File("E:\\ThoughtWorks");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}
