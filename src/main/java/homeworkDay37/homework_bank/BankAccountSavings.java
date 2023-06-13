package homeworkDay37.homework_bank;

public class BankAccountSavings extends Bank_Account{

    static final double interest = 0.03;

    public BankAccountSavings(String account_number, double balance) {
        super(account_number, balance);
    }
    public double calculate_interest(){
         return getBalance() * interest;
    }


}
