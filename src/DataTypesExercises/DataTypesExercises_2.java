package DataTypesExercises;

import java.util.Scanner;

public class DataTypesExercises_2 {
    public static void main(String [] args){
        new DataTypesExercises_2().run();
    }
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double fahrenheit = input.nextDouble();
        inchToMeters(fahrenheit);
    }
    public void inchToMeters(double inch) {
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
