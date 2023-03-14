package bankAccount;



public class BankAccount {

    String accountNumber;//exactly 8 digits
    String accountHolderName;
    double balance;


    double dailyWithdrawLimit = 5000;

    public void deposit(double amount) {

        balance += amount;
    }

    /*public boolean withdraw(double amount) {

    1. user must not be able to withdraw more money than he has in the balance
    2. the amount should be positive number
    3. check that user did not exceed the dailyLimit



        if (amount > 0 && amount <= balance &&
                amount <= dailyWithdrawLimit &&
                dailyWithdrawedAmount + amount <= dailyWithdrawLimit) {

            System.out.println("Transaction is approved. Withdrawing: " + amount + "$");
            balance -= amount;
            dailyWithdrawedAmount += amount;
            return true;
        }else{
            if (amount > dailyWithdrawLimit || dailyWithdrawedAmount + amount > dailyWithdrawLimit) {
                System.out.println("The daily withdrawal limit should not exceed 5000$");
                System.out.println("You already withdrawed " + dailyWithdrawedAmount);
                return false;
            }
            if (amount > balance){
                System.out.println("Insufficient funds");
                return false;
            }

            System.out.println("Something happened! Failed to withdraw. Please try again");
            return false;
        }

    }

        public void setAccountNumber(String accountNumber){ // 86745321
            boolean isValidAccountNumber = true;

            if(accountNumber.length() == 8){
            for(int i = 0;i<8;i++){
                if(!Character.isDigit(accountNumber.charAt(i))){
                    System.out.println("WARNING: The account number must only contain digits.");
                    isValidAccountNumber = false;
                    break;
                }

            }
        }else{
                System.out.println("WARNING: The length of account must be 8");
                isValidAccountNumber = false;
            }
            if(isValidAccountNumber){
                System.out.println("SUCCESSFUL, account number i valid.");
                this.accountNumber = accountNumber;
            }else{
                System.out.println("FAILURE: The provider account number is not valid");
            }
        }



        public String getAccountNumber(){
            return accountNumber;
        }

        public String getAccountHolderName(){
            return accountHolderName;
        }

        public double getBalance(){
            return balance;
        }

        public String toString(){
            return null;
        }


*/
    }
