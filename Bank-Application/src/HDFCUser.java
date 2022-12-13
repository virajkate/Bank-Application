public class HDFCUser implements BankInterface{
    private int AccountNO;
    public String name;
    private int balance;
    public float rateOfInterest;

    public HDFCUser(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNO() {
        return AccountNO;
    }

    public void setAccountNO(int accountNO) {
        AccountNO = accountNO;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int checkbalance() {
        return 0;
    }

    @Override
    public String addMoney(int money) {
        return null;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        return null;
    }

    @Override
    public String withdrawMoney(int money) {
        return null;
    }

    @Override
    public float calculateInterest(int years) {
        return 0;
    }
}
