 public class Main {
        public static void main(String[] args) {
            CreditPaymentService service = new CreditPaymentService();
//            double creditTotal = 1_000_000;
//            int creditYears = 1;
            int paymentOne = service.calculate(1_000_000,9.99,1);
            System.out.println(paymentOne);
            
            int paymentTwo = service.calculate(1_000_000,9.99,2);
            System.out.println(paymentTwo);

            int paymentThree = service.calculate(1_000_000,9.99,3);
            System.out.println(paymentThree);
        }
}
