package section18;

import java.util.Scanner;

public class Ex1807 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 스페이스로 구분이 아니라 스페이스도 입력받고싶을 시 사용
        System.out.print("스페이스를 포함한 문자열을 입력하세요: ");
        String strNextLine = scanner.nextLine();

        System.out.println("strNextLine\t:" +strNextLine); 

        scanner.close();
    }
}
