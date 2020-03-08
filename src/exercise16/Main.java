package exercise16;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger my = new BigInteger("10");
        my = my.pow(50);
        int counter = 0;
        while (counter < 11) {
            if (my.modPow(new BigInteger("1"), new BigInteger("2")).equals(new BigInteger("0")) ||
                    my.modPow(new BigInteger("1"), new BigInteger("3")).equals(new BigInteger("0"))) {
                System.out.println(my);
                counter++;

            }
            my = my.add(new BigInteger("1"));

        }

    }
}
