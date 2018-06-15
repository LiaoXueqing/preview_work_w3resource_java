package InputOutputFileSystem;

import java.io.*;

public class InputOutputFileSystem_17 {
    public static void main(String[] args) {
        try {
            String fileName = "E:\\ThoughtWorks\\1.txt";
            String conLine = "";

            LineNumberReader lmReader = new LineNumberReader(new FileReader(fileName));
            while ((conLine = lmReader.readLine())!=null && lmReader.getLineNumber() <=3) {
                System.out.println(conLine);
            }
            lmReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
