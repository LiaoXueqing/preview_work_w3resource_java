package Numbers;

import java.util.Scanner;

public class Numbers_16 {
    public static void main(String[] args) {
        new Numbers_16().run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        long firstNum = sc.nextLong();
        System.out.print("Input the second number: ");
        long secondNum = sc.nextLong();
        if (isAmicable(firstNum, secondNum)) {
            System.out.println("These numbers are amicable.");
        } else {
            System.out.println("These numbers are not amicable.");
        }
    }
    public boolean isAmicable(long firstNum,long secondNum) {
        if (firstNum == secondNum) {
            return false;
        }
        if (calSumOfProperDiv(firstNum) == secondNum && calSumOfProperDiv(secondNum) == firstNum) {
            return true;
        }
        return false;
    }

    public long calSumOfProperDiv(long num) {
        long sum = 0;
        for (int i = 1; i <= num /2 + 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
