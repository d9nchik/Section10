package exercise27;

public class MyStringBuilder1 {
    char[] str;
    int size;

    public MyStringBuilder1(String s) {
        str = new char[s.length() * 2];
        for (int i = 0; i < s.length(); i++) {
            str[i] = s.charAt(i);
        }
        size = s.length();
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        if (this.size + s.size > str.length) {
            char[] temp = new char[(this.size + s.size) * 2];
            if (this.size >= 0) System.arraycopy(str, 0, temp, 0, this.size);
            str = temp;
        }
        for (int i = 0; i < s.size; i++) {
            str[size] = s.str[i];
            size++;
        }
        return this;
    }

    public MyStringBuilder1 append(int i) {
        return this.append(new MyStringBuilder1("" + i));
    }

    public int length() {
        return size;
    }

    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < size; i++)
            if (str[i] >= 'A' && str[i] <= 'Z')
                str[i] = (char) (str[i] - 'A' + 'a');
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        MyStringBuilder1 temp = new MyStringBuilder1("");
        for (int i = begin; i < end; i++) {
            temp.append(new MyStringBuilder1("" + str[i]));
        }
        return temp;
    }

    public String toString() {
        return new String(str);
    }
}
