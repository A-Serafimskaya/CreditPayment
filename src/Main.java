public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double rateinpercent = 9.99;
        int creditinrub = 1_000_000;
        int periodinyears = 3;
        double annuity = service.calculate(rateinpercent, creditinrub, periodinyears);
        int payment = (int) annuity;
        System.out.println(payment);
    }
}
