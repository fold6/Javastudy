package section04;

import java.util.Scanner;

public class Practice0404_2 {
    public static void main(String[] args) {
        // DB에 존재하는 사용자:
        String isUsername = "admin";
        String isPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("사용자 이름을 입력하세요: ");
        String username = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        // 사용자 이름과 비밀번호를 비교
        if (isUsername.equals(username) && isPassword.equals(password)) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }

        scanner.close();
    }
}
