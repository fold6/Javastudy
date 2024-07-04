package section04;

import java.util.Scanner;
//check (자료 참고하기)
public class Practice0403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학점을 입력하세요 : ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("90점 이상 A학점");
        } else if (score >= 80) {
            System.out.println("80점 이상 B학점");
        } else if (score >= 70) {
            System.out.println("70점 이상 C학점");
        } else if (score >= 60) {
            System.out.println("60점 이상 D학점");
        } else if (score >= 50) {
            System.out.println("50점 이상 E학점");
        }

        /* switch로 바꿀때 */
        //char result = score >= 90 ? 'A' : score >= 80  'B' ---- ;//이런식으로 쭉 전개해나감
        // switch(result){
        //     case 'A';
        //     System.out.println("90이상 a");
        //     break;
        // }

        scanner.close();
    }
}
