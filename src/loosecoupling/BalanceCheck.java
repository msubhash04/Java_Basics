package loosecoupling;

public class BalanceCheck
{
    public static void main(String[] args) {
        HDFCBank hdfcBank = new HDFCBank(5000);
        Withdraw withdraw = new Withdraw(hdfcBank);
        withdraw.displayBalance();
    }
}
