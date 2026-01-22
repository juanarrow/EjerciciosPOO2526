package ejercicio13.cuentas;

public class BankAccount implements AccountOperations {
    
    private double balance;
    private String accountNumber;


    public BankAccount(){
        this.balance = 0;
        this.accountNumber = generatoBankAccountSerial();
    }

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
        this.accountNumber = generatoBankAccountSerial();
    }    

    private static String randomNumbers(int length){
        String numbers = "";
        for(int i=0; i < length; i++){
            int digit = (int)(Math.random()*10);
            numbers += digit;
        }
        return numbers;
    }

    public static String generatoBankAccountSerial(){
        String accountSerial = "ES";
        accountSerial += randomNumbers(2);
        accountSerial += " ";
        accountSerial += randomNumbers(4);
        accountSerial += " ";
        accountSerial += randomNumbers(4);
        accountSerial += " ";
        accountSerial += randomNumbers(4);
        accountSerial += " ";
        accountSerial += randomNumbers(8);
        return accountSerial;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public void transfer(BankAccount targetAccount, double amount) {
        this.balance -= amount;
        targetAccount.balance += amount;
    }


    @Override
    public String toString() {
        return String.format("Número de cta: %s Saldo: %.2f €", accountNumber, balance);
    }
}
