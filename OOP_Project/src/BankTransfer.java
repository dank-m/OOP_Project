public class BankTransfer extends Payment {
private String accountId;
private String BankName;


    public BankTransfer() {
    }

    @Override
    public void pay(double amount) {
        if(validatePayment())
        System.out.println("processing bank transfer of amount " + amount);
 }

    @Override
    public boolean validatePayment() {
        System.out.println("validating bank transfer from " + BankName + " account id: " + accountId);
    return true;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }
}
