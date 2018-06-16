package Numbers;

import java.util.Scanner;

public class Numbers_26 {
    public static void main(String[] args) {
        new Numbers_26().run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        System.out.println(isKeithNum(num) ? "Keith Number" : "Not a Keith Number");
    }
    public boolean isKeithNum(int num) {
        String numStr = Long.toString(num);
        int[] seq = new int[num];
        int i = 0 , sum = 0;
        for (char c : numStr.toCharArray()) {
            seq[i] = Character.digit(c,10);
            sum = seq[i];
            i++;
        }
        while(sum < num){
            seq[i] = seq[i-1] + seq[i-2];
            sum = seq[i];
            i++;
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}
