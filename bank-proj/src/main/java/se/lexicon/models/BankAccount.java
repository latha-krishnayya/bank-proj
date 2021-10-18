package se.lexicon.models;

public class BankAccount {
    //fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private static double depisitLimit=10000;
    private static double withdrawalLimit=300;

    //All arg constructor
    public BankAccount(int accountNumber,
                       double balance,
                       String customerName,
                       String email,
                       int phoneNumber)
    {
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.email=email;
        this.balance=balance;

    }
    //getters and setters

    public int getAccountNumber(){return accountNumber;   }
    public double getBalance(){  return balance; }
    public String getCustomerName(){ return customerName;    }
    public String getPhoneNumber(){  return phoneNumber;    }
    public String getEmail(){  return email;   }

    public void setCustomerName(String customerName){   this.customerName=customerName;  }
    public void setPhoneNumber(String phoneNumber){   this.phoneNumber=phoneNumber;   }
    public void setEmail(String email){  this.email=email;   }
    public void setBalance(double balance) { this.balance=balance;    }
    public void setAccountNumber(int accountNumber){ this.accountNumber=accountNumber;    }


    //deposite and withdraw methods
    public double depositAmount(double amount){
        if(amount < 0) throw new IllegalArgumentException("Amount was negative");
        if(amount > depisitLimit) throw new IllegalArgumentException("Amount exceeds deposit limit");
        this.balance=this.balance+amount;
        return balance;


    }
    public double withdrawAmount(double amount){
        if(amount> balance) throw new IllegalArgumentException("Withdrawal exceeds balance");
        if(amount<0) throw new IllegalArgumentException("Amount was negative");
        if(amount>withdrawalLimit) throw new IllegalArgumentException("Amount exceeds withdrawal limit");
        this.balance=this.balance-amount;
        return balance;
    }
    // Getting customer & account summary
    public String getCustomerProfile(){
        return "{ Customer Name : "+customerName+", Email : "+email+", Phone Number : "+phoneNumber +" }";
    }
    public String getAccountSummary(){
        return "{ Customer Name : "+customerName+", Account Number "+ accountNumber +",  Account Balance : "+balance+", Deposite Limit : "+depisitLimit+" }";
    }

}
