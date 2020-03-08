package exercise20;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal myE = new BigDecimal("1");
        BigDecimal factorial = new BigDecimal("1");
        for (int j = 0; j < 10; j++) {
            for (int i=j*100 + 1; i <= (j+1)*100; i++) {
                factorial = factorial.multiply(new BigDecimal(i + ""));
                myE = myE.add((new BigDecimal("1")).divide(factorial, 25, RoundingMode.FLOOR));
            }

            System.out.println("e("+(j*100+100)+") = " + myE);
        }
    }
}
