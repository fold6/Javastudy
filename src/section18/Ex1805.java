package section18;

import java.util.Scanner;

public class Ex1805 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("세 개의 정수를 입력하세요(스페이스로 구분): ");
        int intNum1 = scanner.nextInt();
        int intNum2 = scanner.nextInt();
        int intNum3 = scanner.nextInt();

        System.out.println("intNum1\t" + intNum1 );
        System.out.println("intNum2\t" + intNum2 );
        System.out.println("intNum3\t" + intNum3 );
        System.out.println("합\t" + (intNum1 + intNum2 + intNum3) );
        //1 1 1을 입력시 111이 나옴 (문자열로 연산됨) 즉, 정수로 연산후에 문자열로 출력해야함(그래서 ()를 묶음)



        scanner.close();
    }
}
