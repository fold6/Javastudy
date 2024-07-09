package section08;

public class BankOOP {
    public static class BankAccount {

        int balance;
        //클래스와 동일한 메서드 = 생성자 라고 부름(생성자 호출시 초기화 0 됌)
        public BankAccount(){
            this.balance = 0;
        }

        public void deposit(int amount) {
            balance += amount;
        }

        public void withdraw(int amount) {
            balance -= amount;
        }

        public void printBalance() {
            System.out.println("잔액" + balance);
        }
        

    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();  
        account1.deposit(1000);
        account1.printBalance();
        account1.deposit(1000);
        account1.printBalance();
        
        /* 어머니 계좌 */
        BankAccount account2 = new BankAccount();  
        account2.deposit(10000);
        account2.printBalance();
        account2.deposit(5000);
        account2.printBalance();
        

    }
}
