package section18;
import java.util.Scanner;
public class Practice1803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 적절한 Scanner 객체의 메서드를 사용하여 아래와 같이 입력/출력이 되게 하시오!
        /*
         * 이름을 입력하세요: 김일남
         * 나이를 입력하세요: 99
         * 키를 입력하세요: 169.9
         * 이름: 김일남, 나이: 99, 키: 169.90
         */
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.print("키를 입력하세요: ");
        double height = scanner.nextDouble();
        System.out.printf("이름: %s, 나이: %d, 키: %.1f\n", name, age, height);
        
        scanner.close();
    }
}
