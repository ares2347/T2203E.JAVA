package practice_exam_JV1;

public class Bank {
    public double balance;
    public double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest(){
        return getBalance()*(getRate()/1200);
    }
}
