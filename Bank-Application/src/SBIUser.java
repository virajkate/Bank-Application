import java.util.UUID;

public class SBIUser implements BankInterface {
    private String AccountNo;

//    what are the attributes a bank account should have

    private String AccountNO;
    public String name;
    private int balance;
   private static float rateOfInterface;
    private String password;

    public SBIUser(String name, int balance,String password) {
        this.name = name;
        this.balance = balance;

        this.AccountNo = String.valueOf(UUID.randomUUID());
        this.password=password;
    }

    public String getAccountNO() {
        return AccountNO;
    }

    public int getBalance() {
        return balance;
    }


    @Override
    public int checkbalance() {
        return balance;
    }

    @Override
    public String addMoney(int money) {
      balance=balance+money;
      return "Succefully added money " + balance + " your new balance is balance";
    }

    @Override
    public String withdrawMoney(int money,String enterpassword) {
        if(enterpassword==password) {
            if (money > balance) {
                return "insufficient balance";
            } else {
                balance = balance - money;
                return "money get withdrawn " + money;
            }
        }
        else{
           return "wrong password";
        }

    }

    @Override
    public String withdrawMoney(int money) {
        return null;
    }

    @Override
    public float calculateInterest(int years) {
        float rateOfInterest = 0;
        float interest = balance*years*rateOfInterest/100;
       return interest;

    }
}
