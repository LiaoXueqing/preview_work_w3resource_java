package Numbers;

import java.util.Scanner;

public class Numbers_12 {
    public static void main(String[] args) {
        new Numbers_12().run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = sc.nextLong();
        System.out.println(isHarshad(num) ? num+ " is a Harshad Number" : num+" is not a Harshad Number");
    }

    public boolean isHarshad (long num) {
        String numStr = Long.toString(num);
        int sum = 0;
        for (char c:numStr.toCharArray()) {
            sum +=Character.digit(c,10);
        }
        return num % sum ==0;
    }
}
