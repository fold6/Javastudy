package section08;

public class BankProcedural {

    static double balance = 0;

    // balance = 잔고
    // deposit = 입금
    // withdraw = 출금
    // printBalance= 잔액조회
    public static void deposit(int amount){
        balance += amount;
    }

    public static void withdraw(int amount){
        balance -= amount;
    }
    
    public static void printBalance(){
        System.out.println("잔액" + balance);
    }
    
    public static void main(String[] args) {
        deposit(1000);
        deposit(1000);
        printBalance();
        withdraw(500);
        printBalance();
    }
}
