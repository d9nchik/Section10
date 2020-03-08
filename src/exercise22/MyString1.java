package exercise22;

public class MyString1 {
    char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] temp = new char[end - begin];
        System.arraycopy(chars, begin, temp, 0, temp.length);
        return new MyString1(temp);
    }

    public MyString1 toLowerCase() {
        char[] temp = new char[chars.length];
        System.arraycopy(chars, 0, temp, 0, chars.length);
        for (int i = 0; i < temp.length; i++)
            if (temp[i] >= 'A' && temp[i] <= 'Z')
                temp[i] = (char) (temp[i] - 'A' + 'a');
        return new MyString1(temp);
    }

    public boolean equals(MyString1 s) {
        if (chars.length == s.chars.length)
            return false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.chars[i])
                return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        int copyOfI = i;
        int size = 0;
        while (copyOfI != 0) {
            size++;
            copyOfI /= 10;
        }
        char[] number = new char[size];
        for (int j = size - 1; j >= 0; j--) {
            number[j] = (char) (i % 10 + '0');
            i /= 10;
        }
        return new MyString1(number);
    }
}
