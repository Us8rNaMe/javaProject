package objects2;

public class BankAccount2 {
        String accountNumber; //exactly 8 digits
        String accountHolderName;
        double balance;

        double dailyWithdrawLimit = 5000;
        double dailyWithdrawedAmount;


        public void deposit(double amount) {
            balance += amount;
            System.out.println("INFO: " + accountHolderName + " successfully deposited " + amount + "$");
        }


        public boolean withdraw(double amount) {
        /*
        1. user must not be able to withdraw more money than he has in the balance
        2. the amount should be positive number
        3. check that user did not exceed the dailyLimit
         */


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

        public void setAccountNumber(String accountNumber) {    //  "89632145"
            boolean isValidAccountNumber = true;

            if (accountNumber.length() == 8) {
                for (int i = 0; i < 8; i++) {
                    if (!Character.isDigit(accountNumber.charAt(i))) {
                        System.out.println("WARNING: The account number must only contain digits.");
                        isValidAccountNumber = false;
                        break;
                    }
                }
            } else {
                System.out.println("WARNING: The length of account number must be 8");
                isValidAccountNumber = false;
            }
            //Log message - is a message of developer for developer/user, which tells what is going on in the application

            if (isValidAccountNumber) {
                System.out.println("SUCCESSFUL, account number is valid.");
                this.accountNumber = accountNumber;
            } else {
                System.out.println("FAILURE: The provided account number is not valid");
            }
        }

        public String getAccountNumber() {
            System.out.println("Account number: " + accountNumber);
            return accountNumber;
        }


        public void setAccountHolderName(String accountHolderName) {
        /*
        1. account holder name must not be null, or empty
        2. the length must be less than 256 chars
         */

            boolean isValidAccountHolderName = true;

            if (accountHolderName.equals(null) || accountHolderName.isEmpty() || accountHolderName.trim().length() == 0 ||
                    accountHolderName.length() > 256) {
                isValidAccountHolderName = false;
            }

            if (isValidAccountHolderName) {
                System.out.println("SUCCESS: Account holder name is valid");
                this.accountHolderName = accountHolderName;
            } else {
                System.out.println("FAILURE: account holder name must not be empty or more than 256 letters");
            }
        }


        public String getAccountHolderName() {
            return accountHolderName;
        }


        public double getBalance() {
            return balance;
        }

        public void printInfo() {
            String str = "Account holder's name: " + accountHolderName + "\n" +
                    "Account number: " + accountNumber + "\n" +
                    "Current balance: " + balance + "\n" +
                    "Today withdrawed: " + dailyWithdrawedAmount + "$";
            System.out.println(str);;
        }


    }


