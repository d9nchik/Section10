package exercise10;

public class Main {
    public static void main(String[] args) {
        Queue my = new Queue();
        for (int i = 1; i <= 20; i++) {
            my.enqueue(i);
        }
        while (!my.empty()) {
            System.out.print(my.dequeue() + " ");
        }
        System.out.println();
    }
}
