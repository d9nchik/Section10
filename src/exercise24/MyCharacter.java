package exercise24;

public class MyCharacter {
    char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public int compareTo(char symbol) {
        return value - symbol;
    }

    public int intValue() {
        return value;
    }
}
