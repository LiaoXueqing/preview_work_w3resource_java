package Numbers;

public class Numbers_8 {
    public static void main(String[] args) {
        new Numbers_8().run();
    }
    public void run(){
        printTheFirstTenCatalanNum();
    }

    public void printTheFirstTenCatalanNum() {
        int num = 10;
        int[] carArr = new int[num + 2];
        carArr[1] = 1;
        System.out.println("Print out the first 10 Catalan numbers:");
        for (int i = 1; i <= num; i++) {

            for (int j = i; j > 1; j--)
                carArr[j] = carArr[j] + carArr[j - 1];

            carArr[i + 1] = carArr[i];

            for (int j = i + 1; j > 1; j--)
                carArr[j] = carArr[j] + carArr[j - 1];

            System.out.println( carArr[i + 1] - carArr[i]);
        }
    }
}
