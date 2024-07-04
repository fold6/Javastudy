package section05;

public class jump0502 {
    public static void main(String[] args) {
        int coffee = 10;
        int money = 300;
        while (money > 0 && coffee > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은" + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("판매중지 합니다");
            }

        }
    }
}
