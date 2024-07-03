package section18;

import java.util.Scanner;

public class Ex1806 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("세 개의 문자열을 입력하세요(스페이스로 구분): ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();

        System.out.println("str1\t:" +str1);
        System.out.println("str2\t:" +str2);
        System.out.println("str3\t:" +str3);

        scanner.close();
    }
}
