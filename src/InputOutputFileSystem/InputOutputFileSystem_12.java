package InputOutputFileSystem;

import java.io.*;

public class InputOutputFileSystem_12 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("E:\\ThoughtWorks\\1.txt");
            BufferedReader br = new BufferedReader(fr);
            String conLine;

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
