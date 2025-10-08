public class CreditPaymentService {
    public double calculate(double rateInPercent, int creditInRub, int periodInYears) {
        ;

        double m = rateInPercent / 1200;
        int periodInMonths = periodInYears  * 12;
        double a = 1 + m;
        double b = Math.pow(a, periodInMonths);
        double c = b - 1;
        double d = b / c;
        double k = m * d;
        double result = creditInRub * k;
        return result;
    }
}