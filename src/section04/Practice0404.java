package section04;

import java.util.Scanner;

//check 
public class Practice0404 {
    public static void main(String[] args) {
        // DB에 존재하는 사용자:
        String isUsername = "admin";
        String isPassword = "password123";

        String username = "admin";
        String password = "password123";
        if (isUsername == username && isPassword.equals(password)) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
