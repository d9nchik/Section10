package exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackOfIntegers factors= new StackOfIntegers();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int userNumber = input.nextInt();
        int divisor = 2;
        while (userNumber!=1){
            if (userNumber%divisor==0){
                userNumber/=divisor;
                factors.push(divisor);
            }
            else
                divisor++;
        }
        System.out.print("All factors: ");
        while (!factors.empty()){
            System.out.print(factors.pop()+" ");
        }
        System.out.println();
    }
}
