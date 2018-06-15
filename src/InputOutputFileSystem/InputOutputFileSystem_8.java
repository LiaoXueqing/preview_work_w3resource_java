package InputOutputFileSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputFileSystem_8 {
    public static void main(String[] args) throws IOException {
        System.out.print("Please input: ");
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String input = R.readLine();
        System.out.println("Your input: " + input);
    }
}
