package exercise25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("a?b?gf#e", "[?#]")));
    }
    public static String[] split(String s, String regex) {
        String[] first = s.split(regex);
        String[] second = new String[s.length() * 3];
        int counter = 0;
        int words = 0;
        int letterInWord=0;
        int letter = 0;
        for (; letter < s.length(); ) {
            if (first.length>words&&first[words].charAt(letterInWord)==s.charAt(letter)){
                second[counter]=first[words];
                letter+=first[words].length();
                words++;
            }else {
                second[counter]= String.valueOf(s.charAt(letter));
                letter++;
            }
            counter++;
        }
        String[] toReturn = new String[counter];
        System.arraycopy(second, 0, toReturn, 0, toReturn.length);
        return toReturn;
    }
}
