package exercise6;

import exercise3.MyInteger;
import exercise5.StackOfIntegers;

public class Main {


    public static void main(String[] args) {
        StackOfIntegers primeNumbers = new StackOfIntegers();
        for (int i = 2; i < 120; i++) {
            if (MyInteger.isPrime(i))
                primeNumbers.push(i);
        }

        System.out.print("All prime numbers: ");
        while (!primeNumbers.empty()){
            System.out.print(primeNumbers.pop()+" ");
        }
        System.out.println();
    }
}
