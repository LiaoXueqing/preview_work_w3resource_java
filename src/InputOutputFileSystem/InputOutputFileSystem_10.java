package InputOutputFileSystem;

import java.io.*;

public class InputOutputFileSystem_10 {
    public static void main(String[] args) {
        byte[] buffer = null;
        try {
            File file = new File("E:\\ThoughtWorks\\1.txt");
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bais = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int len;
            while ((len = fis.read(b)) != -1) {
                System.out.println(new String(b, 0, len-1));
                bais.write(b,0,len);
            }
            fis.close();
            bais.close();
            buffer = bais.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(buffer);
    }
}
