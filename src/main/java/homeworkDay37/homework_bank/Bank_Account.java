package homeworkDay37.homework_bank;

public abstract class Bank_Account {
    String account_number;
    double balance;

    public Bank_Account(String account_number, double balance){
        this.account_number = account_number;
        this.balance = balance;
    }

    public String getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposits(double dep){
         balance+=dep;
    }
    public void withdraws(double draw){
        if(balance>draw) {
            balance-=draw;
            System.out.println("withdraw successfully");

        }else{
            System.out.println("ERROR! your balance was less than withdraw");
        }
    }
}
