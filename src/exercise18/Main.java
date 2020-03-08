package exercise18;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int counter=0;
        while (counter<6){
            number=number.add(new BigInteger("1"));
            if(number.isProbablePrime(1)){
                System.out.println(number);
                counter++;
            }
        }
    }
}
