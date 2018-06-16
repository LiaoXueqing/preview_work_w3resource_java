package Numbers;

public class Numbers_7 {
    public static void main(String[] args) {
        new Numbers_7().run();
    }
    public void run(){
        printLucasNum();
    }

    public void printLucasNum() {
        int[] num = new int[10];
        num[0] = 2;
        num[1]  = 1;

        for (int i = 2; i <10 ; i++) {
            num[i] = num[i-1]+num[i-2];
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println(num[i]);
        }
    }
}
