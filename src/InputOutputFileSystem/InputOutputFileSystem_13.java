package InputOutputFileSystem;

import java.io.*;

public class InputOutputFileSystem_13 {
    public static void main(String[] args) {
        String data = "";
        try {
            FileReader fr = new FileReader("E:\\ThoughtWorks\\1.txt");
            BufferedReader br = new BufferedReader(fr);
            String conLine;

            while ((conLine = br.readLine()) != null) {
                data += conLine +"\n";
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(data);
    }
}
