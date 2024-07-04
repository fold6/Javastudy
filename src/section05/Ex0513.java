package section05;

import java.util.Scanner;

public class Ex0513 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("숫자입력, 종료는 0 입력: ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        
        System.out.println("입력된 숫자의 합 :" + sum);
        scanner.close();
    }
}
