package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myVal = 10_000;

	    int minInt = Integer.MIN_VALUE;
	    int maxInt = Integer.MAX_VALUE;
        System.out.println("Min int: " + minInt);
        System.out.println("Max int: " + maxInt);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Min short: " + minShort);
        System.out.println("Max short: " + maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Min long: " + minLong);
        System.out.println("Max long: " + maxLong);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Min byte: " + minByte);
        System.out.println("Max byte: " + maxByte);
    }
}
