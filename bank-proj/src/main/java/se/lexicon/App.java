package se.lexicon;

import se.lexicon.models.BankAccount;

public class App
{
    public static void main( String[] args )
    {
        BankAccount account1= new BankAccount(1, 100, "Sneha","sneha@gmail.com", 12345269);
        BankAccount account2= new BankAccount(2, 200, "Latha", "latha@gmail.com", 124561532);
        BankAccount account3= new BankAccount(3, 300, "Bande","bande@gmail.com",79784151);

        System.out.println(account1.getCustomerProfile());
        System.out.println(account1.getAccountSummary());


        try{
            System.out.println(account2.depositAmount(800));
            System.out.println(account2.withdrawAmount(200));
            System.out.println(account2.getBalance());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }



}
