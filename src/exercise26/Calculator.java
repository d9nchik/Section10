package exercise26;

public class Calculator {
    public static void main(String[] args) {
        String[] data = args[0].split("[ +-/*]");
        // Check number of strings passed

        if (data.length != 2) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }
        char sign = ' ';
        if (args[0].contains("+"))
            sign = '+';
        else if (args[0].contains("-"))
            sign = '-';
        else if (args[0].contains("*"))
            sign = '*';
        else if (args[0].contains("/"))
            sign = '/';
        // The result of the operation
        int result = 0;

        // Determine the operator
        switch (sign) {
            case '+':
                result = Integer.parseInt(data[0]) +
                        Integer.parseInt(data[1]);
                break;
            case '-':
                result = Integer.parseInt(data[0]) -
                        Integer.parseInt(data[1]);
                break;
            case '*':
                result = Integer.parseInt(data[0]) *
                        Integer.parseInt(data[1]);
                break;
            case '/':
                result = Integer.parseInt(data[0]) /
                        Integer.parseInt(data[1]);
        }

        // Display result
        System.out.println(data[0] + ' ' + sign + ' ' + data[1]
                + " = " + result);
    }
}
