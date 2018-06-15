package DataTypesExercises;

import java.util.Scanner;

public class DataTypesExercises_6 {
    public static void main(String [] args){
        new DataTypesExercises_6().run();
    }
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Input height in inches: ");
        double heightInInches = input.nextDouble();
        calbodyMassIndex(weightInPounds, heightInInches);
    }

    public void calbodyMassIndex(double weightInPounds, double heightInInches) {
        double weightInKg = 0.45359237 * weightInPounds;
        double heightInM = heightInInches * 0.0254;
        double BMI = weightInKg / Math.pow(heightInM, 2);
        System.out.println("Body Mass Index is " + BMI);
    }
}
