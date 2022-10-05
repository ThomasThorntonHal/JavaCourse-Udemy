public class LbsToKG {
    static double KILO_CONVERSION = 0.45359237;
    public static void main(String[] args) {
        double lbs = 200;
        double kg = lbs * KILO_CONVERSION;

        System.out.printf("\n%f lbs = %f kg", lbs, kg);
    }
}
