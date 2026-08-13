package loosecoupling;

public class Withdraw {
    private HDFCBank hdfcBank;

    public Withdraw(HDFCBank hdfcBank)
    {
        this.hdfcBank=hdfcBank;
    }

    public void displayBalance(){
        hdfcBank.disp();
    }
}
