package section05;

public class Ex0511 {
    public static void main(String[] args) {
        // 제목 출력
        System.out.println("구구단");
        // 구분선 출력
        System.out.println("-------");

        // 바깥쪽 반복문: 구구단의 세로 단을 반복
        for (int j = 2; j < 10; j++) {
            // 안쪽 반복문: 각 단의 곱셈을 계산하고 출력
            for (int i = 1; i < 10; i++) {
                // 각 단의 곱셈을 출력
                System.out.printf("%d × %d = %d\t", i, j, i * j);
            }
            // 각 단의 곱셈 출력이 끝나면 줄바꿈
            System.out.println(); 
        }
    }
}
