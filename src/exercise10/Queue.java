package exercise10;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new int[capacity];
        this.size = 0;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int firstElement = elements[0];
        if (size - 1 >= 0) System.arraycopy(elements, 1, elements, 0, size - 1);
        size--;
        return firstElement;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
