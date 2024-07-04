package section05;

public class jump0501 {
    public static void main(String[] args) {
        int treeHit = 0;
        //treehit이 10보다 작을때 반복
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
        }
        //10이 됐을때 아래 구문실행
        if (treeHit == 10){
            System.out.println("나무가 넘어갑니다.");
        }
    }
}
