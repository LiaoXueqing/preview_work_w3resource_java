package InputOutputFileSystem;

import java.io.*;

public class InputOutputFileSystem_15 {
    public static void main(String[] args) {
        try {
            String fileName = "E:\\ThoughtWorks\\1.txt";
            FileWriter fw = new FileWriter(fileName,false);
            fw.write("Input output file system exercise");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String conLine = "";
            while ((conLine = br.readLine()) != null) {
                System.out.println(conLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
