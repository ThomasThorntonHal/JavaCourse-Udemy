public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(12));
        System.out.println(calcFeetAndInchesToCentimeters(6, 2));
        System.out.println(calcFeetAndInchesToCentimeters(6, 14));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 14));
        System.out.println(calcFeetAndInchesToCentimeters(6, -2));
        calcCentimetersToFeetAndInches(146);
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 1 || inches < 0 || inches > 12) {
            return -1;
        }
        return calcFeetAndInchesToCentimeters((feet*12) + inches);
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0)
            return -1;
        return inches * 2.54;
    }

    public static void calcCentimetersToFeetAndInches(int cm) {
        if (cm < 0)
            return;

        double inch = cm / 2.54;
        int feet = (int) inch / 12;
        double inches = inch - feet*12;
        System.out.println(Integer.toString(feet) + "'" + Double.toString(inches) + "\"");
    }
}
