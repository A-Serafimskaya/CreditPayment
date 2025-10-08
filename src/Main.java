public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double rateInPercent = 9.99;
        int creditInRub = 1_000_000;
        int periodInYears = 3;
        double annuity = service.calculate(rateInPercent, creditInRub, periodInYears);
        int payment = (int) annuity;
        System.out.println(payment);
    }
}
