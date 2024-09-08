package Day7.Encapsulation;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(0, "홍길동", "12345678910", "카카오");

        account.setDeposit(1000);

        int money = account.getDeposit();
        System.out.println("예금액 : " + money);
        System.out.println(account);
    }
}
