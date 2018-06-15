package InputOutputFileSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputOutputFileSystem_14 {
    public static void main(String[] args) {
        List<String> dataList = new ArrayList<>();

        try {
            FileReader fr = new FileReader("E:\\ThoughtWorks\\1.txt");
            BufferedReader br = new BufferedReader(fr);
            String conLine;

            while ((conLine = br.readLine()) != null) {
                dataList.add(conLine);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(dataList.toArray()));
    }
}
