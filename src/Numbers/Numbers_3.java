package Numbers;

import java.util.Random;
import java.util.Scanner;

public class Numbers_3 {
    public static void main(String[] args) {
        new Numbers_3().run();
    }
    public void run(){
        generateRandomInt();
    }

    public void generateRandomInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the starting number of the range: ");
        int startNum = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int endNum = sc.nextInt();

        Random rand = new Random();


        System.out.println("The generated random integers in a specific range: "
                + (rand.nextInt(endNum - startNum + 1) + startNum));

    }
}
