public class Main {
    public static void main(String[] args) {
        SpeedConverter.printConversion(100);

        SpeedConverter.printConversion(-12);

        SpeedConverter.printConversion(0);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        System.out.println(BarkingDog.shouldWakeUp(true, 1));

        System.out.println(LeapYear.isLeapYear(1924));

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(7.0, 7.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(4.0, 7.0));

        System.out.println(EqualSumChecker.hasEqualSum(1, 2, 3));
        System.out.println(EqualSumChecker.hasEqualSum(1, 2, 5));

        System.out.println(TeenNumberChecker.hasTeen(12, 14, 90));
        System.out.println(TeenNumberChecker.isTeen(12));
    }
}
