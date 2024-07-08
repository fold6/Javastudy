package section06;

import java.util.Scanner;

public class Practice0605 {
    public static void main(String[] args) {
        // 문자열을 입력하세요: java
        // 문자열 뒤집기 avaj

        String input;
        String reversed = "";

        // System.out.println("java".length()); // 문자열 길이 구하기
        // System.out.println("java".charAt(3)); // 문자열의 특정 문자 가져오기

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력하세요: ");
        input = scanner.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.printf("문자열 뒤집기: %s\n", reversed);
        
        scanner.close();
    }
}
