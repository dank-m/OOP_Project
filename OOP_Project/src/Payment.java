public abstract class Payment {
private double amount;
abstract public void pay(double amount);
 abstract public boolean validatePayment();

 public double getAmount() {
  return amount;
 }

 public void setAmount(double amount) {
  this.amount = amount;
 }
}
