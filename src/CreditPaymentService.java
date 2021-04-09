public class CreditPaymentService {
    public static int calculate(double sum, double annualPercent, int years) {
//        double annualPercent = 9.99;
        double monthPercent = annualPercent / 12 / 100;
        int monthTotal = years * 12;
        double paymentAmount = sum * (monthPercent + (monthPercent / (Math.pow(1 + monthPercent, monthTotal) - 1)));
        return (int) paymentAmount;
    }
}
