package loosecoupling;

public class HDFCBank {
    private int balance;

    public HDFCBank(int balance){
        this.balance=balance;
    }
    public void disp(){
        System.out.println("The balance is "+balance);
    }
    public void withdraw(int drawAmt){
        balance -= drawAmt;
    }
    public void deposite(int depositAmt)
    {
        balance += depositAmt;
    }
}
