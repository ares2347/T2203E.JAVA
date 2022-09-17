package session_2;

public class Account {
    //attributes
    String id;
    String name;
    int balance;

    //constructors
    public Account() {
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //setters & getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //methods
    public boolean credit(int amount){
        if(amount>0){
            setBalance(this.balance + amount);
            System.out.println("Topup succeeded. Balance:" + balance);
            return true;
        } else{
            System.out.println("Invalid amount");
            return false;
        }
    }

    public boolean debit(int amount){
        if(amount>0 && amount<=balance){
            setBalance(this.balance - amount);
            System.out.println("Payment succeeded. Remains: "+ balance);
            return true;
        } else if(amount>0 && amount>balance){
            System.out.println("Payment failed");
            return false;
        } else {
            System.out.println("Invalid amount");
            return false;
        }
    }

    public void transferTo (int amount, Account account){
        if(this.debit(amount)){
            account.credit(amount);
        }else {
            System.out.println("Transaction failed");
        }
    }
}
