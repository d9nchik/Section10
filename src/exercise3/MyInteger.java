package exercise3;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isEven(MyInteger number) {
        return number.value % 2 == 0;
    }

    public static boolean isOdd(MyInteger number) {
        return number.value % 2 == 1;
    }

    public static boolean isPrime(MyInteger number) {
        return isPrime(number.value);
    }

    public boolean equals(int number) {
        return number == value;
    }

    public boolean equals(MyInteger number) {
        return number.value == this.value;
    }

    public static int parseInt(char[] number) {
        int outNumber = 0;
        for (char c : number) {
            outNumber *= 10;
            outNumber += c - '0';
        }
        return outNumber;
    }

    public static int parseInt(String number) {
        int outNumber = 0;
        for (int k = 0; k < number.length(); k++) {
            outNumber *= 10;
            outNumber += number.charAt(k) - '0';
        }
        return outNumber;
    }
}
