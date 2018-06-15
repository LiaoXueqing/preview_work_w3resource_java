package DataTypesExercises;

import java.util.Scanner;

public class DataTypesExercises_7 {
    public static void main(String [] args){
        new DataTypesExercises_7().run();
    }
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double distance = input.nextLong();
        System.out.print("Input hour: ");
        int hr = input.nextInt();
        System.out.print("Input minutes: ");
        int min = input.nextInt();
        System.out.print("Input seconds: ");
        int sec = input.nextInt();
        calSpeed(distance, hr, min, sec);
    }

    public void calSpeed(double distance, int hr, int min, int sec) {
        double timeSeconds  = (hr*3600) + (min*60) + sec;;
        double mps = distance / timeSeconds;
        double kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        double mph = kph / 1.609f;
        System.out.println("Your speed in meters/second is " + mps + "\n" +
                "Your speed in km/h is " + kph + "\n" +
                "Your speed in miles/h is " + mph + "\n");
    }
}
