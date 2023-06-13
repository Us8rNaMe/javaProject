package objects2;

public class Bank2 {
        public static void main(String[] args) {
            BankAccount2 client1 = new BankAccount2();
            BankAccount2 client2 = new BankAccount2();

            client1.setAccountNumber("54536787"); //
            client2.setAccountNumber("23546633"); //error

            client1.setAccountHolderName("John Travolta");
            client2.setAccountHolderName("Bruce Lee");

            client1.deposit(1900);
            client2.deposit(100);

            client1.withdraw(200); //1700
            client1.withdraw(5000);
            client1.withdraw(1000);
            System.out.println(client1.getBalance());

            client1.deposit(10000);
            client1.printInfo();

            client1.withdraw(3000);

            client2.printInfo();
            client2.withdraw(-90);
            System.out.println("Bruce's balance: " + client2.getBalance());


        }
    }

