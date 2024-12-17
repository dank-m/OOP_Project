public class Paypal extends Payment {
    private String username;
    private String password;

    @Override
    public void pay(double amount) {
if(validatePayment()){
        System.out.println("Paying "+amount+" using Paypal by " + username);
    }
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Paypal Payment is validating...");
    return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
