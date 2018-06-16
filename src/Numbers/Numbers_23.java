package Numbers;

public class Numbers_23 {
    public static void main(String[] args) {
        new Numbers_23().run();
    }
    public void run(){
        System.out.println("All the narcissistic numbers between 1 and 1000: ");
        for (int i = 1; i <= 1000 ; i++) {
            if (isNarcissisticNum(i)) {
                System.out.println(i);
            }
        }
    }

    public boolean isNarcissisticNum(long num) {
        if (num < 0) return false;
        String numStr = String.valueOf(num);
        int sum = 0;
        int len = numStr.length();
        for (int i = 1; i <= len; i++) {
            char digit = numStr.charAt(i - 1);
            sum += Math.pow(Character.digit(digit,10), len);
        }
        if (sum == num) return true;
        return false;
    }
}
