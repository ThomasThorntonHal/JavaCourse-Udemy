/*
 Coding exercise 1
 */
import static java.lang.Math.round;

public class SpeedConverter {
    public static long toMilesPerHour(double speed) {
        return (speed >= 0) ? (long) round((speed / 1.609)) : -1;
    }

    public static void printConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);
        if (result == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }
}
