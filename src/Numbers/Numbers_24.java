package Numbers;

import java.util.Scanner;

public class Numbers_24 {
    public static void main(String[] args) {
        new Numbers_24().run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = sc.nextLong();
        if (isPalindromeNum(num)) {
            System.out.println("It is a Palindrome number.");
        } else {
            System.out.println("It is not a Palindrome number.");
        }
    }

    public boolean isPalindromeNum(long num) {
        char[] numArr = Long.toString(num).toCharArray();
        String reverseNum = "";
        for (int i = numArr.length - 1; i >= 0; i--) {
            reverseNum += numArr[i];
        }
        return num == Long.valueOf(reverseNum);
    }
}
