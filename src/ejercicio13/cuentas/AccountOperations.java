package ejercicio13.cuentas;

public interface AccountOperations {
    public void deposit(double amount);
    public void withdraw(double amount);
    public void transfer(BankAccount targetAccount, double amount);   
}
