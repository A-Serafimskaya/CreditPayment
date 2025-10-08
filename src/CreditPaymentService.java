public class CreditPaymentService {
    public double calculate(double rateinpercent, int creditinrub, int periodinyears) {
        ;

        double m = rateinpercent / 1200;
        int periodinmonths = periodinyears * 12;
        double a = 1 + m;
        double b = Math.pow(a, periodinmonths);
        double c = b - 1;
        double d = b / c;
        double k = m * d;
        double result = creditinrub * k;
        return result;
    }
}