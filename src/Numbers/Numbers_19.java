package Numbers;

import java.util.Scanner;

public class Numbers_19 {
    public static void main(String[] args) {
        new Numbers_19().run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Data: ");
        System.out.print("Input a number: ");
        long num = sc.nextLong();
        if (isCyclic(num)) {
            System.out.println("It is a cyclic number.");
        } else {
            System.out.println("It is not a cyclic number.");
        }
    }

    public boolean isCyclic(long num) {
        long cyclicNum = num;
        while (true) {
            cyclicNum = moveBit(cyclicNum);
            if (cyclicNum == num) {
                break;
            }
            if (cyclicNum % num != 0) {
                return false;
            }
        }
        return true;
    }

    public long moveBit(long num) {
        String numStr = Long.toString(num);
        String newStr = numStr.substring(1) +
                numStr.substring(0, 1);
        return Long.valueOf(newStr);
    }
}
