public interface BankInterface {
    int checkbalance();

    String addMoney(int money);

    String withdrawMoney(int money,String password);

    String withdrawMoney(int money);

    float calculateInterest(int years);
}
