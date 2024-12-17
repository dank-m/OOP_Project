import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payment payment = null;

        System.out.println("Select Payment Method: \n 1. Credit Card \n  2. PayPal \n  3. Bank Transfer \n 4.Cash");
        int choice = scanner.nextInt();

        if (choice == 1) {
            CreditCard card = new CreditCard();
            System.out.println("Enter credit card number -- has to be 16 numbers only");
            card.setCardNumber(scanner.next());
            System.out.println("Enter CVV number -- 3 or 4 numbers only");
            card.setCvv(scanner.nextInt());
            System.out.println("Enter Expiration date in the format MM/YY");
            card.setExpDate(scanner.next());
            payment = card;
        } else if (choice == 2) {
            Paypal paypal = new Paypal();
            System.out.println("Enter Your Paypal Username :");
            String username = scanner.next();
            paypal.setUsername(username);
            System.out.println("Enter Your Paypal Password :");
            String password = scanner.next();
            paypal.setPassword(password);
            payment = paypal;



        } else if (choice == 3) {
            BankTransfer bank = new BankTransfer();
            System.out.println("Enter your account id");
            String id = scanner.next();
            bank.setAccountId(id);
            System.out.println("Enter the name of the Bank");
            String bname = scanner.next();
            bank.setBankName(bname);
            payment = bank;


        } else if (choice == 4) {
            System.out.println("Enter cash amount");
            double cashAmount = scanner.nextDouble();
            Cash cash = new Cash(cashAmount);
            payment = cash;
        }
        else {
            System.out.println("Invalid Choice!");
            return;
        }
        payment.setAmount(500);
        payment.pay(payment.getAmount());
  }
}
