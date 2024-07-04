package section04;

public class JumpEx0404 {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;

        // 중첩 if문 리팩토링 후
        /*
         * if(조건식){
         * }else if{(조건식2)
         * }else{
         * }
         */

        if (money >= 3000) {
            System.out.println("돈을 내고 택시 타고가라"); //조건 불충족이라 다음코드로 넘어감
        } else if (hasCard) {
            System.out.println("카드로 택시 타고가라"); // 조건 충족이라 이 코드의 결과 출력됨
        } else {
            System.out.println("걸어가라");
        }
    }
}
