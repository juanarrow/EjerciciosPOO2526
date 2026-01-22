package ejercicio13;

import ejercicio13.cuentas.BankAccount;

public class App {
    public static void main(String[] args) {        
        BankAccount cuenta1 = new BankAccount();
        BankAccount cuenta2 = new BankAccount(1500);
        BankAccount cuenta3 = new BankAccount(6000);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        cuenta1.deposit(2000);
        cuenta2.withdraw(600);
        cuenta3.deposit(75);
        cuenta1.withdraw(55);
        cuenta2.transfer(cuenta3, 100);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
}
