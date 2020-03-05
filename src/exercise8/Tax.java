package exercise8;

public class Tax {
    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private double[] rates;
    private int[][] brackets;
    private double taxableIncome;

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public double[] getRates() {
        return rates;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public Tax() {
    }

    public Tax(int filingStatus, double[] rates, int[][] brackets, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.rates = rates;
        this.brackets = brackets;
        this.taxableIncome = taxableIncome;
    }

    public double getTax(){

        double tax = 0;
        int counter = 0;
        while (true) {
            if (counter<brackets[filingStatus].length&&taxableIncome >= brackets[filingStatus][counter]) {
                if (counter==0){
                    tax += brackets[filingStatus][counter] * rates[counter];
                }
                else {
                    tax += (brackets[filingStatus][counter]-brackets[filingStatus][counter-1]) * rates[counter];
                }
                counter++;
            } else {
                tax += (taxableIncome - brackets[filingStatus][counter-1]) * rates[counter];
                break;
            }
        }
        return tax;
    }
}
