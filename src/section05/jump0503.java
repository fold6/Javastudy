package section05;
//check
public class jump0503 {
    public static void main(String[] args) {
        int coffee = 10;
        int money = 300;
        while (money > 0) {//항상 ture이므로 무한루프
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은" + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("판매중지 합니다");
                break;
                //무한 루프에 빠지지 않고 멈춤
            }

        }
    }
}
