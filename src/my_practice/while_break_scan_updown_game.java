package my_practice;

import java.util.Scanner;

public class while_break_scan_updown_game {
    public static void main(String[] args) {
        // 1부터 50 사이의 임의의 정수를 변수 target에 저장
        int target = (int)(Math.random() * 50) + 1;
        
        // Scanner 객체를 생성하여 사용자 입력을 받기 위한 준비
        Scanner scan = new Scanner(System.in);

        // 시도 횟수를 세기 위한 변수 초기화
        int count = 0;
        // 사용자 입력 값을 저장할 변수 초기화
        int user = 0;

        // 무한 루프 시작
        for (;;) {
            // 사용자에게 숫자 입력을 요청
            System.out.print("숫자를 입력하세요: ");
            // 사용자가 입력한 정수를 변수 user에 저장
            user = scan.nextInt();

            // 입력한 숫자와 target 값이 일치하는지 비교
            if (target == user) {
                // 정답을 맞춘 경우 출력하고 반복문 종료
                System.out.println("정답! 숫자는 " + user + "입니다! " + count + "번 만에 맞췄네요!");
                break;
            } else if (target > user) {
                // 입력한 숫자가 target 보다 작은 경우
                System.out.println("업!");
            } else { // target < user
                // 입력한 숫자가 target 보다 큰 경우
                System.out.println("다운!!");
            }
            
            // 시도 횟수 증가
            count++;
        }
        
        // Scanner 객체 사용 종료
        scan.close();
    }
}
