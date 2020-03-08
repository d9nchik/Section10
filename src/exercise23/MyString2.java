package exercise23;

public class MyString2 {
    String s;

    public MyString2(String s) {
        this.s = s;
    }

    public int compare(String s) {
        int size = Math.min(this.s.length(), s.length());
        for (int i = 0; i < size; i++) {
            int difference = this.s.charAt(i) - s.charAt(i);
            if (difference != 0)
                return difference;
        }
        if (this.s.length() != s.length()) {
            if (s.length() > this.s.length())
                return -s.charAt(size) + 'a' - 1;
            else
                return this.s.charAt(size) + 1 - 'a';
        }
        return 0;
    }

    public MyString2 substring(int begin) {
        StringBuilder temp = new StringBuilder();
        for (int i = begin; i < s.length(); i++) {
            temp.append(s.charAt(i));
        }
        return new MyString2(temp.toString());
    }

    public MyString2 toUpperCase() {
        char[] temp = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp[i] = s.charAt(i);
        }
        for (int i = 0; i < temp.length; i++)
            if (temp[i] >= 'a' && temp[i] <= 'z')
                temp[i] = (char) (temp[i] - 'a' + 'A');
        return new MyString2(new String(temp));
    }

    public char[] toChars() {
        char[] temp = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp[i] = s.charAt(i);
        }
        return temp;
    }

    public static MyString2 valueOf(boolean b) {
        if (b)
            return new MyString2("true");
        else
            return new MyString2("false");
    }
}
