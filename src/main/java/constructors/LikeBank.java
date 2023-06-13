package constructors;

public class LikeBank {
    String accountNumber;
    String accountHolderName;
    double balance;
    double interestRate;
    double overdraftLimit;

    public LikeBank(){
        accountHolderName = "none";
        accountNumber = "none";
        balance = 0.0;
        interestRate = 0.0;
        overdraftLimit = 0;
    }

    public LikeBank(String accountNumber,String accountName, double balance, double interestRate, double overdraftLimit){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountName;
        this.balance = balance;
        this.interestRate = interestRate;
        this.overdraftLimit = overdraftLimit;
    }
    public LikeBank(LikeBank object) {
        this.accountNumber = object.accountNumber;
        this.accountHolderName = object.accountHolderName;
        this.balance = object.balance;
        this.interestRate = object.interestRate;
        this.overdraftLimit = object.overdraftLimit;

    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountName(){
        return  accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public void  deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(balance-amount<overdraftLimit){
            System.out.println("Error: the winthdraw of this amount is not allowed");
        }else{
            balance -= amount;
        }
    }


    public double calculatedInterest(){
        return balance / 100 * interestRate;
    }

    public String getDatails(){
        String info = "Account holder name: "+ accountHolderName + "\n"+
                "Account number: "+ accountNumber+ "\n"+
                "Balance: "+ balance+ "\n"+
                "Interest rate: "+ interestRate+ "\n"+
                "OverDraft limit: "+ overdraftLimit;

        return info;
    }






}
