package exercise21;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger my = new BigInteger((Integer.MAX_VALUE) + "");
        my = my.add(new BigInteger("1"));
        int counter = 0;
        while (counter < 10) {
            if (my.modPow(new BigInteger("1"), new BigInteger("5")).equals(new BigInteger("0")) ||
                    my.modPow(new BigInteger("1"), new BigInteger("6")).equals(new BigInteger("0"))) {
                System.out.println(my);
                counter++;

            }
            my = my.add(new BigInteger("1"));

        }

    }
}

