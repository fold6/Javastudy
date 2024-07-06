package section05;

public class Ex0510 {
    public static void main(String[] args) {
        // 제목 출력
        System.out.println("구구단");
        // 구분선 출력
        System.out.println("-------");

        // 바깥쪽 반복문: 2단부터 9단까지 반복
        for (int i = 2; i < 10; i++) {
            // 안쪽 반복문: 각 단의 곱셈을 계산하고 출력
            for (int j = 1; j < 10; j++) {
                // 구구단의 i단 * j를 계산하여 출력
                System.out.printf("%d × %d = %d\t", i, j, i * j);
            }
            // 각 단의 곱셈 출력이 끝나면 줄바꿈
            System.out.println();
        }

    }
}
