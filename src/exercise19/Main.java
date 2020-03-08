package exercise19;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger my = new BigInteger("1");

        System.out.println("    p        2^p – 1");
        System.out.println("---------------------");
        for (int p = 2; p <= 100; p++) {
            my=my.add(new BigInteger("1")).multiply(new BigInteger("2")).add(new BigInteger("-1"));
            if (my.isProbablePrime(1))
                System.out.printf("%4d\t%12d\n", p, my);
        }
    }
}
