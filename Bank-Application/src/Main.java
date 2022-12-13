import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name and initial balance and password");
        String name = sc.next();
        int balance=sc.nextInt();
//        creation of account has happened
         String password=sc.next();
        SBIUser acc1=new SBIUser(name,balance,password);
        System.out.println("The account of new SBI Account is"+acc1.getAccountNO());
//        add money
        System.out.println("Enter the money that you want to add");
        int money=sc.nextInt();
        acc1.addMoney(money);
//        check balance
        int newbalance = acc1.getBalance();
        System.out.println("The new balance is "+ newbalance);
//        withdraw money
        System.out.println("withdraw money");
        int amt=sc.nextInt();
        System.out.println("Enter password");
        String enterpassword=sc.next();
        String result=acc1.withdrawMoney(amt,enterpassword);
        System.out.println(result);
//        String AccountNo=acc1.getAccountNO();
//        String result1=acc1.addMoney(100);
//        System.out.println(result1);
//        String result2=viraj.withdrawMoney(100);
//        System.out.println(result2);
    }
}