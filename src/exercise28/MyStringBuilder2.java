package exercise28;

public class MyStringBuilder2 {
    char[] str;
    int size;

    public MyStringBuilder2() {
        str = new char[16];
        size = 0;
    }

    public MyStringBuilder2(char[] chars) {
        size = chars.length;
        str = new char[chars.length * 2];
        System.arraycopy(chars, 0, str, 0, size);
    }

    public MyStringBuilder2(String s) {
        size = s.length();
        str = new char[size * 2];
        for (int i = 0; i < size; i++) {
            str[i] = s.charAt(i);
        }
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] temp = new char[(offset + s.size) * 2];
        if (offset >= 0) System.arraycopy(str, 0, temp, 0, offset);
        if (offset + s.size - offset >= 0)
            System.arraycopy(s.str, 0, temp, offset, offset + s.size - offset);
        if (size - offset >= 0) System.arraycopy(str, offset, temp, offset + s.size, size - offset);
        size = offset + s.size;
        str = temp;
        return this;
    }

    public MyStringBuilder2 reverse() {
        for (int i = 0; i < size / 2; i++) {
            str[i] = str[size - 1 - i];
        }
        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        MyStringBuilder2 temp = new MyStringBuilder2();
        for (int i = begin; i < size; i++) {
            temp.insert(i, new MyStringBuilder2(str[i] + ""));
        }
        return temp;
    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < size; i++)
            if (str[i] >= 'a' && str[i] <= 'z')
                str[i] = (char) (str[i] + 'A' - 'a');
        return this;
    }
}
