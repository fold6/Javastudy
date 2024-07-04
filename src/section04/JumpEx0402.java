package section04;

public class JumpEx0402 {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;

        // 비교 연산자 사용
        // 돈이 3000이상이면 택시타라 (2000보다 작으므로 else도 기입해야 실행됨)
        // 또는 카드 가지고 있으면 택시타라 (|| or연산자 사용)
        if (money >= 3000 || hasCard) {
            System.out.println("택시타고 가라");
        } else {
            System.out.println("걸어 가라");
        }
    }

}
