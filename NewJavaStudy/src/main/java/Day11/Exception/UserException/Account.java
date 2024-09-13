package Day11.Exception.UserException;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    // 입금
    public void deposit(int money){
        balance += money;
    }

    // 출금
    public void withdraw(int money) throws BalanceException  { // 예외 전가
        // (잔고) < (출금액) : 출금할 수 없음
        if (balance < money){
            // 예외 강제 발생
            // - throw new ??Exception();
            throw new BalanceException("잔액이 부족합니다.");
        }
        balance -= money;
    }
}
