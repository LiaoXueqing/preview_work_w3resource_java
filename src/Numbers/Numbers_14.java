package Numbers;

import java.util.Scanner;

public class Numbers_14 {
    public static void main(String[] args) {
        new Numbers_14().run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = sc.nextLong();
        System.out.println(isAutomorphic(num) ? "a Automorphic Number" : "Not a Automorphic Number");
    }

    public boolean isAutomorphic (long num) {
        String squareOfNumStr = Long.toString((long)Math.pow(num,2));
        int numLen = Long.toString(num).length();
        int squareOfNumLen = squareOfNumStr.length();
        String endsDigit = squareOfNumStr.substring(squareOfNumLen-numLen);
        return endsDigit.equals(Long.toString(num));
    }
}
