package DataTypesExercises;
import java.util.Scanner;
public class DataTypesExercises_8 {
    public static void main(String [] args){
        new DataTypesExercises_8().run();
    }
    public void run(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double num = in.nextDouble();
        calNum(num);
    }
    public static void calNum(double num){
        System.out.printf("Square: %12.2f\n", num * num);
        System.out.printf("Cube: %14.2f\n", num * num * num);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(num, 4));
    }
}
