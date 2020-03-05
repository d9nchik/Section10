package exercise7;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++)
            accounts[i] = new Account(i, 100);

        int id;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an id: ");
        id = input.nextInt();
        while (id < 0 || id >= accounts.length) {
            System.out.println("Id is incorrect!");
            System.out.print("Enter an id: ");
            id = input.nextInt();
        }

        while (true) {
            System.out.print("\nMain menu\n" +
                    "1: check balance\n" +
                    "2: withdraw\n" +
                    "3: deposit\n" +
                    "4: exit\n" +
                    "Enter a choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The balance is " + accounts[id].getBalance());
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    accounts[id].withdraw(input.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    accounts[id].deposit(input.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter an id: ");
                    id = input.nextInt();
                    while (id < 0 || id >= accounts.length) {
                        System.out.println("Id is incorrect!");
                        System.out.print("Enter an id: ");
                        id = input.nextInt();
                    }
                    break;
                default:
                    System.out.println("Input is incorrect!");
            }
        }
    }
}
