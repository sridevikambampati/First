public class ByteShortInt {
    public static void main(String args[]){
        byte byteValue = 20;
        short shortValue = 10;
        int intValue = 100;

        long longTotal = 50000L + 10L *(byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }

}
