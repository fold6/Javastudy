package section04;

public class JumpEx0403 {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;

        // 중첩 if문 리팩토링 전
        if (money >= 3000 || hasCard) {
            System.out.println("돈을 내고 택시 타고가라");
        } else {
            if (hasCard) {
                System.out.println("카드로 택시 타고가라");
            } else {
                System.out.println("걸어가라");
            }
        }
    }
}
