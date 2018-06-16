package Numbers;

import java.util.Scanner;

public class Numbers_15 {
    public static void main(String[] args) {
        new Numbers_15().run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        String numStr = sc.nextLine();
        System.out.println(isDuckNum(numStr) ? "a Duck Number" : "Not a Duck Number");
    }

    public boolean isDuckNum( String numStr) {
        if (numStr.indexOf("0") != -1 && numStr.indexOf("0") != 0) {
            return true;
        }
        return false;
    }
}
