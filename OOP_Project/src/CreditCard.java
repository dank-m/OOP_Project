public class CreditCard extends Payment {
  private String cardNumber;
  private int cvv;
  private String expDate;



  public CreditCard() {
  }

  @Override
  public boolean validatePayment() {
    System.out.println("Validating Credit Card details...");
    if ((cardNumber.length() == 16) && cardNumber.matches("\\d+")) {
      if (cvv > 99 && cvv < 10000){
        if (expDate.matches("\\d{2}/\\d{2}")) {
        return true;

      }
        else {
          return false;
        }
      }
      else {
        return false;
      }
    }
    else {
      System.out.println("Invalid credit card");

      return false;
    }
  }
    @Override

    public void pay(double amount) {
    if (validatePayment()) {
      System.out.println("Payment Successful");
    }
    else {
      System.out.println("Payment Failed");
    }
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
   this.cardNumber = cardNumber;
  }

  public int getCvv() {
    return cvv;
  }

  public void setCvv(int cvv) {
    this.cvv = cvv;
  }

  public String getExpDate() {
    return expDate;
  }

  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }
}
