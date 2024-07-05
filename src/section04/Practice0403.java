package section04;

import java.util.Scanner;

//check (자료 참고하기)
public class Practice0403 {
    public static void main(String[] args) {
        int score = 59;
        // 아래는 바로 출력하는 예시
        // if (score >= 90) {
        // System.out.println("90점 이상 A학점");
        // } else if (score >= 80) {
        // System.out.println("80점 이상 B학점");
        // } else if (score >= 70) {
        // System.out.println("70점 이상 C학점");
        // } else if (score >= 60) {
        // System.out.println("60점 이상 D학점");
        // } else {
        // System.out.println("60점 미만 F학점");
        // }

        // 스캐너로 입력하고 출력하는 예시
        Scanner scanner = new Scanner(System.in);
        // 사용자 입력을 받기 위한 객체를 생성
        System.out.print("점수를 입력하세요 : ");
        // 사용자에게 점수를 입력하라는 메시지를 출력
        int intNum = scanner.nextInt();
        // 사용자가 입력한 정수 값을 intNum 변수에 저장합니다.

        
        if (score >= 90) {
            System.out.println("90점 이상 A학점");
        } else if (score >= 80) {
            System.out.println("80점 이상 B학점");
        } else if (score >= 70) {
            System.out.println("70점 이상 C학점");
        } else if (score >= 60) {
            System.out.println("60점 이상 D학점");
        } else {
            System.out.println("60점 미만 F학점");
        }

        scanner.close();
        // Scanner 객체를 닫기

    }
}
