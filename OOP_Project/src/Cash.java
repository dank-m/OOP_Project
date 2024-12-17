public class Cash extends Payment {
    private double cashAmount;

    public Cash( double cashAmount) {
        this.cashAmount = cashAmount;
    }
    @Override
    public boolean validatePayment() {
        System.out.println("Validating Cash Payment...");
        if (cashAmount < getAmount() ) {
            System.out.println("No cash available for payment.");
            return false;
        } else if (cashAmount > getAmount()) {
                System.out.println("Processing Cash Payment of " + getAmount());
                cashAmount -= getAmount();
                System.out.println("Remaining Cash: " + cashAmount);
               return true;
        }
        else {
            System.out.println("Cash Payment is valid.");
            return true;
        }
    }
    @Override
    public void pay(double amount) {
        if (validatePayment() ){
            System.out.println(" Payment of " + amount + " cash is successful.");

        }

    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }
}
