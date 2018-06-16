package Numbers;

import java.util.Scanner;

public class Numbers_17 {
    public static void main(String[] args) {
        new Numbers_17().run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Data: ");
        System.out.println("Input a number: ");
        long num = sc.nextLong();
        if (isCircularPrime(num)) {
            System.out.println("It is a Circular Prime number.");
        } else {
            System.out.println("It is not a Circular Prime number.");
        }
    }

    public boolean isCircularPrime(long num) {
        int lastDigit = (int) num % 10;
        if (lastDigit == 0 || lastDigit == 5 || lastDigit % 2 == 0) {
            return false;
        }
        long tempNum = moveBit(num);
        if (isPrime(num)) {
            while (tempNum != num) {
                if (isPrime(tempNum)) {
                    tempNum = moveBit(tempNum);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isPrime(long num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
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
