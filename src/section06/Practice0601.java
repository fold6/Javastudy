package section06;

import java.util.Scanner;

public class Practice0601 {
    public static void main(String[] args) {
        int number;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        //while문을 이용해 보기와 같은 결과가 작동되도록 코드작성
        while(number != 0){
            sum += number;
            System.out.print("숫자를 입력하세요 (종료 : 0) : ");
            number = scanner.nextInt();
        }

        System.out.print("입력된 숫자들의 합 :" + sum);
        scanner.close();
    }

}
