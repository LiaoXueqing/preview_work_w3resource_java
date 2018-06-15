package DataTypesExercises;

import java.util.Scanner;

public class DataTypesExercises_1 {
    public static void main(String [] args){
        new DataTypesExercises_1().run();
    }
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        fahrenheitToCelsius(fahrenheit);
    }
    public void fahrenheitToCelsius(double FahDegree) {
        double CelDegree = (FahDegree - 32) / 1.8;
        System.out.println(FahDegree + " degree Fahrenheit is equal to " + CelDegree + " in Celsius");
    }
}
