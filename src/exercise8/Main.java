package exercise8;

public class Main {
    public static void main(String[] args) {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                // −or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        double[] rates2001 = {15, 27.5, 30.5, 35.5, 39.1};
        int[][] brackets2001 = {
                {27050, 65550, 136750, 297350}, // Single filer
                {45200, 109250, 166500, 297350}, // Married jointly
                // −or qualifying widow(er)
                {22600, 54625, 83250, 148657}, // Married separately
                {36250, 93650, 151650, 297350} // Head of household
        };

        String[] status = {"Single filer", "Married jointly", "Married separately", "Head of household"};

        Tax test = new Tax();
        test.setBrackets(brackets);
        test.setRates(rates);

        System.out.println("2011\tSingle filer\t\tMarried jointly\tMarried separately\tHead of household");
        tableMaker(status, test);
        System.out.println();

        test.setBrackets(brackets2001);
        test.setRates(rates2001);
        System.out.println("2001\tSingle filer\t\tMarried jointly\tMarried separately\tHead of household");
        tableMaker(status, test);
    }

    private static void tableMaker(String[] status, Tax test) {
        for (int j = 50_000; j < 60_000; j += 1000) {
            test.setTaxableIncome(j);
            for (int i = 0; i < status.length; i++) {
                test.setFilingStatus(i);
                System.out.print("\t\t\t"+test.getTax());
            }
            System.out.println();
        }
    }
}
