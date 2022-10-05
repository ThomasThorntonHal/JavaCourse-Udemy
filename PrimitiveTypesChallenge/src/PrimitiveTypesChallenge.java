public class PrimitiveTypesChallenge {

    public static void main(String[] args) {
        byte b = 5;
        short s = 6;
        int i = 12;

        long result = 50000L + (10L*(s + b + i));

        System.out.println(result);
    }
}
