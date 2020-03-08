package exercise17;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        final long SQRT_OF_MAX = (long) Math.floor(Math.sqrt(Long.MAX_VALUE)) + 1;
        BigInteger number = new BigInteger(SQRT_OF_MAX + "");
        System.out.println("Max Long Value is " + Long.MAX_VALUE);
        for (int i = 0; i < 11; i++) {
            System.out.println(number.pow(2));
            number = number.add(new BigInteger("1"));
        }
    }
}
